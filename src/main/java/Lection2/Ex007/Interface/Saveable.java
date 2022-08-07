package Lection2.Ex007.Interface;

import Lection2.Ex007.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
