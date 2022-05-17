public class Main {
    public static void main(String[] args) {
        new MakeRequestGUI("API Reader");
        /*JFrame frame = new JFrame("API Reader");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Data panel
        JPanel resultPanel = new JPanel();
        JLabel resultLabel = new JLabel("Result");
        resultPanel.add(resultLabel);

        JPanel taPanel = new JPanel();
        JTextArea ta = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(ta);
        ta.setEditable(false);
        ta.setAutoscrolls(true);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        taPanel.add(scrollPane);

        // Finalize panel
        JPanel finalizePanel = new JPanel();
        JLabel endpointLabel = new JLabel("Endpoint");
        JTextField endpointTf = new JTextField(40);
        JButton makeRequest = new JButton("Make Request");
        finalizePanel.add(endpointLabel);
        finalizePanel.add(endpointTf);
        finalizePanel.add(makeRequest);

        // Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.SOUTH, finalizePanel);
        frame.getContentPane().add(BorderLayout.CENTER, scrollPane );
        frame.getContentPane().add(BorderLayout.NORTH, resultPanel);
        frame.setVisible(true);

        makeRequest.addActionListener(e -> {
            //ta.setText(APIHandler.makeRequest(endpointTf.getText(), ""));
        });*/
    }
}
