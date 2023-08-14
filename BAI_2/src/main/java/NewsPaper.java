import java.time.LocalDate;

public class NewsPaper extends Document_main{
    private LocalDate newsPaperPublishDay;
    public NewsPaper(){

    }

    public NewsPaper(LocalDate newsPaperPublishDay) {
        this.newsPaperPublishDay = newsPaperPublishDay;
    }

    public NewsPaper(String doccumentCode, String documentPublishName, long documentPublishOfNumber, LocalDate newsPaperPublishDay) {
        super(doccumentCode, documentPublishName, documentPublishOfNumber);
        this.newsPaperPublishDay = newsPaperPublishDay;
    }

    public LocalDate getNewsPaperPublishDay() {
        return newsPaperPublishDay;
    }

    public void setNewsPaperPublishDay(LocalDate newsPaperPublishDay) {
        this.newsPaperPublishDay = newsPaperPublishDay;
    }
    public void toString_new(){
        System.out.printf("  Book | %10s | %10s | %10s |           |         |       |       |   %10s   |",doccumentCode, documentPublishName,documentPublishOfNumber, newsPaperPublishDay);
        System.out.println();
    }
}
