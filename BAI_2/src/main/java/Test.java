import java.time.LocalDate;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Manager_Document MD1 = new Manager_Document();
        int select = 0;

        do {
            System.out.println("=============MENU===============");
            System.out.println("1: Thêm mới tài liệu");
            System.out.println("2: Xoá tài liệu theo mã");
            System.out.println("3: Hiển thị danh sách tài liệu");
            System.out.println("4: Tìm kiếm");
            System.out.println("0: Thoát");
            System.out.print("Xin nhập lựa chọn: ");
            select = input.nextInt();
            if(select == 1){
                System.out.println("=============MENU===============");
                System.out.println("1: Thêm Book");
                System.out.println("2: Thêm Magazine");
                System.out.println("3: Thêm NewsPaper");
                System.out.print("Nhập lựa chọn : ");
                int select_document_type = input.nextInt();
                if(select_document_type == 1){
//Book(String doccumentCode, String documentPublishName, long documentPublishOfNumber, String bookAutherName, int bookPageNumber)
                    input.nextLine();
                    System.out.println("Nhập mã tài liệu ( String): ");
                    String docCode = input.nextLine();
                    System.out.println("Nhập tên nhà xuất bản ( String): ");
                    String docPublishName = input.nextLine();
                    System.out.println("Nhập số bản phát hành ( long): ");
                    long docPublishOfNumber = input.nextLong();
                    input.nextLine();
                    System.out.println("Nhập tên tác giả ( String): ");
                    String boAutherName = input.nextLine();
                    System.out.println("Nhập số trang ( int): ");
                    int boPageNumber = input.nextInt();
                    Document_main book = new Book(docCode, docPublishName, docPublishOfNumber, boAutherName, boPageNumber);
                    MD1.addNewDocument(book);
                    Book bookk = (Book) book;
                    bookk.toString_new();
                } else if (select_document_type == 2) {
//Magazine(String doccumentCode, String documentPublishName, long documentPublishOfNumber, long magazinePublishNumber, LocalDate magazinePublishMonth)
                    input.nextLine();
                    System.out.println("Nhập mã tài liệu ( String): ");
                    String docCode = input.nextLine();
                    System.out.println("Nhập tên nhà xuất bản ( String): ");
                    String docPublishName = input.nextLine();
                    System.out.println("Nhập số bản phát hành ( long): ");
                    long docPublishOfNumber = input.nextLong();
                    input.nextLine();
                    System.out.println("Nhập số phát hành ( long): ");
                    long magPublishNumber = input.nextLong();
                    input.nextLine();
                    System.out.println("Nhập tháng phát hành (String yyyy-mm): ");
                    String  input_magPublishMonth= input.nextLine();
                    LocalDate magPublishMonth = LocalDate.parse(input_magPublishMonth);
                    Document_main magazine = new Magazine(docCode, docPublishName, docPublishOfNumber, magPublishNumber, magPublishMonth);
                    MD1.addNewDocument(magazine);
                    Magazine mag = (Magazine) magazine;
                    mag.toString_new();
                } else if (select_document_type ==3) {
// NewsPaper(String doccumentCode, String documentPublishName, long documentPublishOfNumber, LocalDate newsPaperPublishDay)
                    input.nextLine();
                    System.out.println("Nhập mã tài liệu ( String): ");
                    String docCode = input.nextLine();
                    System.out.println("Nhập tên nhà xuất bản ( String): ");
                    String docPublishName = input.nextLine();
                    System.out.println("Nhập số bản phát hành ( long): ");
                    long docPublishOfNumber = input.nextLong();
                    input.nextLine();
                    System.out.println("Nhập ngày phát hành ( String yyyy-mm-dd): ");
                    String input_newsPublishDay = input.nextLine();
                    LocalDate newsPublishDay = LocalDate.parse(input_newsPublishDay);
                    Document_main newsPaper = new NewsPaper(docCode, docPublishName, docPublishOfNumber, newsPublishDay);
                    MD1.addNewDocument(newsPaper);
                    NewsPaper news = (NewsPaper) newsPaper;
                    news.toString_new();
                }
            } else if (select == 2) {
                System.out.println("helo 2");
            } else if (select == 3) {
                System.out.println("  Loại |Mã tài liệu |Nhà xuất bản|   Số bản   |   Tác giả  |    Trang   |Số phát hành|Tháng phát hành|Ngày phát hành|");
                for (Document_main doc : MD1.document_mainList) {
                    doc.toString();
                }
            }else if (select == 4) {
                System.out.println("helo 4");
            }else System.out.println("Sai rồi, mời nhập lại !!!");
        }while (select!=0);


    }
}
