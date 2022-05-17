import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class RequestResultGUI {
    private final JFrame frame;
    private final String result;

    public RequestResultGUI(String title, String result) {
        frame = new JFrame("Request to: " + title);

        this.result = result;

        initResult();
    }

    // Create the window to show the result of the request
    public void initResult() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());


        JTextArea ta = new JTextArea();
        ta.setLineWrap(true);
        ta.setText(result);
        ta.setEditable(false);

        JScrollPane pane = new JScrollPane(ta);
        pane.setSize(800, 600);
        pane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        panel.setLayout(new BorderLayout());
        panel.add(pane);

        frame.setContentPane(panel);
        frame.pack();
        frame.setSize(800, 600);
        frame.setVisible(true);
    }
}
