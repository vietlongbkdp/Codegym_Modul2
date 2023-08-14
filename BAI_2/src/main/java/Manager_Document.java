import java.util.ArrayList;
import java.util.List;

public class Manager_Document {
    protected List<Document_main> document_mainList;
    public Manager_Document(){
        this.document_mainList = new ArrayList<>();
    }

    public Manager_Document(List<Document_main> document_mainList) {
        this.document_mainList = document_mainList;
    }
    public void addNewDocument(Document_main doc){
        this.document_mainList.add(doc);
    }

}
