package Projects_OOP.Lection02.TextEdit.Interface;

import Projects_OOP.Lection02.TextEdit.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
