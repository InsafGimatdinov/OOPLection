package Lection2.Ex007.Format;

import Lection2.Ex007.Document.TextDocument;
import java.io.FileWriter;
import java.io.IOException;

public class Md extends TextFormat {

    @Override
    public void SaveAs(TextDocument document, String path) {
        try (FileWriter writer = new FileWriter(path + ".md", false)) {
            writer.write("<## Md format>\n");
            writer.write(document.getData());
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
