package Lection2.Ex007.Format;

import java.io.FileWriter;
import java.io.IOException;
import Lection2.Ex007.Document.TextDocument;

public class Doc extends TextFormat {

    @Override
    public void SaveAs(TextDocument document, String path) {
        try (FileWriter writer = new FileWriter(path + ".doc", false)) {
            writer.write("<?Doc format>\n");
            writer.write(document.getData());
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
