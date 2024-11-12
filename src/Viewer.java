import javax.swing.*;
import javax.swing.event.DocumentListener;

public class Viewer {

    JTextArea textArea;


    public Viewer() {
        JFrame frame = new JFrame();
        textArea = new JTextArea();
        DocListener documentListener = new DocListener(this);


        textArea.getDocument().addDocumentListener(documentListener);



        frame.add(textArea);




        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);



        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public JTextArea getTextArea() {
        return textArea;
    }
}
