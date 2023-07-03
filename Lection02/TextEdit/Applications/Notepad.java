package Projects_OOP.Lection02.TextEdit.Applications;

import java.util.ArrayList;
import java.util.List;

import Projects_OOP.Lection02.TextEdit.Document.TextDocument;
import Projects_OOP.Lection02.TextEdit.Format.TextFormat;

public class Notepad {
    private List<TextDocument> documents;
    private int index;

    public Notepad() {
        documents = new ArrayList<>();
        index = -1;
    }

    public void newFile() {
        documents.add(new TextDocument());
        index++;
    }

    public TextDocument currentDocument(){
        return documents.get(index);
    }

    public void SaveAs(String path, TextFormat format) {
        format.SaveAs(documents.get(index), path);
    }
}
