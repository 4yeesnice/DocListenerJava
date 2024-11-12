import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DocListener implements DocumentListener {

    private Viewer viewer;
    String filePath = "output.txt";


    public DocListener(Viewer viewer){
        this.viewer = viewer;
    }


    @Override
    public void insertUpdate(DocumentEvent e) {
        saveToFile();
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        saveToFile();
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        saveToFile();
    }


    private void saveToFile() {
        String textToSave = viewer.getTextArea().getText();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(textToSave);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
