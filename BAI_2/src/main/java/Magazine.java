import java.time.LocalDate;

public class Magazine extends Document_main{
    private long magazinePublishNumber;
    private LocalDate magazinePublishMonth;
    public Magazine(){

    }

    public Magazine(long magazinePublishNumber, LocalDate magazinePublishMonth) {
        this.magazinePublishNumber = magazinePublishNumber;
        this.magazinePublishMonth = magazinePublishMonth;
    }

    public Magazine(String doccumentCode, String documentPublishName, long documentPublishOfNumber, long magazinePublishNumber, LocalDate magazinePublishMonth) {
        super(doccumentCode, documentPublishName, documentPublishOfNumber);
        this.magazinePublishNumber = magazinePublishNumber;
        this.magazinePublishMonth = magazinePublishMonth;
    }

    public long getMagazinePublishNumber() {
        return magazinePublishNumber;
    }

    public void setMagazinePublishNumber(long magazinePublishNumber) {
        this.magazinePublishNumber = magazinePublishNumber;
    }

    public LocalDate getMagazinePublishMonth() {
        return magazinePublishMonth;
    }

    public void setMagazinePublishMonth(LocalDate magazinePublishMonth) {
        this.magazinePublishMonth = magazinePublishMonth;
    }
    public void toString_new(){
        System.out.printf("  Magazine | %10s | %10s | %10s |          |         |   %10s    |    %10s   |      |",doccumentCode, documentPublishName,documentPublishOfNumber, magazinePublishNumber, magazinePublishMonth);
        System.out.println();
    }
}
