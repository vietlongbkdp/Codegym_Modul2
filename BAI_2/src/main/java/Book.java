public class Book extends Document_main{
    private String bookAutherName;
    private int bookPageNumber;
    public Book(){

    }

    public Book(String bookAutherName, int bookPageNumber) {
        this.bookAutherName = bookAutherName;
        this.bookPageNumber = bookPageNumber;
    }

    public Book(String doccumentCode, String documentPublishName, long documentPublishOfNumber, String bookAutherName, int bookPageNumber) {
        super(doccumentCode, documentPublishName, documentPublishOfNumber);
        this.bookAutherName = bookAutherName;
        this.bookPageNumber = bookPageNumber;
    }

    public String getBookAutherName() {
        return bookAutherName;
    }

    public void setBookAutherName(String bookAutherName) {
        this.bookAutherName = bookAutherName;
    }

    public int getBookPageNumber() {
        return bookPageNumber;
    }

    public void setBookPageNumber(int bookPageNumber) {
        this.bookPageNumber = bookPageNumber;
    }
    public void toString_new(){
               System.out.printf("  Book | %10s | %10s | %10s | %10s | %10s |       |       |      |",doccumentCode, documentPublishName,documentPublishOfNumber, bookAutherName, bookPageNumber);
                System.out.println();
        }
}
