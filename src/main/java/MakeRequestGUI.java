import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class MakeRequestGUI {
    private final JFrame frame;
    private final HashMap<JTextField, JTextField> dataFields;
    private JPanel dataPanel;

    public MakeRequestGUI(String title) {
        frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        dataFields = new HashMap<>();

        initQuery();
    }

    public void initQuery() {
        JPanel panel = new JPanel();

        // Endpoint panel
        JLabel endpointLabel = new JLabel("Endpoint URL");
        JTextField endpointTextField = new JTextField(60);

        // Make request
        JButton makeRequest = new JButton("Make Request");

        // Data panel
        JPanel parentDataPanel = new JPanel();
        dataPanel = new JPanel();
        JButton addData = new JButton("Add Data");
        addData.setAlignmentX(Component.CENTER_ALIGNMENT);
        dataPanel.setLayout(new BoxLayout(dataPanel, BoxLayout.Y_AXIS));
        parentDataPanel.add(dataPanel);
        parentDataPanel.add(addData);

        frame.setSize(800, 150);

        panel.add(endpointLabel);
        panel.add(endpointTextField);
        panel.add(parentDataPanel);
        panel.add(makeRequest);

        // Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setVisible(true);

        addData.addActionListener(e -> {
            if (dataFields.size() == 10) return;

            addDataField();
        });

        makeRequest.addActionListener(e -> {
            HashMap<String, String> data = new HashMap<>();
            for (JTextField field : dataFields.keySet()) {
                JTextField dataField = dataFields.get(field);
                if (field.getText().isEmpty() || dataField.getText().isEmpty()) continue;
                data.put(field.getText(), dataField.getText());
            }
            new RequestResultGUI(endpointTextField.getText(), APIHandler.makeRequest(endpointTextField.getText(), data));
        });
    }

    private void addDataField() {
        JPanel dataEntryPanel = new JPanel();
        JTextField header = new JTextField(20);
        JTextField data = new JTextField(20);
        dataEntryPanel.add(header);
        dataEntryPanel.add(data);

        dataFields.put(header, data);

        dataPanel.add(dataEntryPanel);

        frame.setSize(frame.getWidth(), frame.getHeight() + 36);
        frame.setVisible(true);
    }
}
