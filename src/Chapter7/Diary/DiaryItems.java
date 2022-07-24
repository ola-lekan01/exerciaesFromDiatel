package Chapter7.Diary;

public class DiaryItems {
    private String diaryContent;
    public DiaryItems(){

    }
    public DiaryItems(String diaryContent){
        this.diaryContent = diaryContent;
    }

    public String getDiaryContent() {
        return diaryContent;
    }

    public String setDiaryContent(String diaryContent) {
        this.diaryContent = diaryContent;
        return diaryContent;
    }
}
