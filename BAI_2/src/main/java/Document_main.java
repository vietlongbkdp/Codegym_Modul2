public class Document_main {
    protected String doccumentCode;
    protected String documentPublishName;
    protected long documentPublishOfNumber;
    public Document_main(){

    }

    public Document_main(String doccumentCode, String documentPublishName, long documentPublishOfNumber) {
        this.doccumentCode = doccumentCode;
        this.documentPublishName = documentPublishName;
        this.documentPublishOfNumber = documentPublishOfNumber;
    }

    public String getDoccumentCode() {
        return doccumentCode;
    }

    public void setDoccumentCode(String doccumentCode) {
        this.doccumentCode = doccumentCode;
    }

    public String getDocumentPublishName() {
        return documentPublishName;
    }

    public void setDocumentPublishName(String documentPublishName) {
        this.documentPublishName = documentPublishName;
    }

    public long getDocumentPublishOfNumber() {
        return documentPublishOfNumber;
    }

    public void setDocumentPublishOfNumber(long documentPublishOfNumber) {
        this.documentPublishOfNumber = documentPublishOfNumber;
    }

    @Override
    public String toString() {
        return "Document_main{" +
                "doccumentCode='" + doccumentCode + '\'' +
                ", documentPublishName='" + documentPublishName + '\'' +
                ", documentPublishOfNumber=" + documentPublishOfNumber +
                '}';
    }
}
