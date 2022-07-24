package Chapter7.Diary;

import org.junit.jupiter.api.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @@author Lekan
 */

public class DiaryTest {
    private DiaryList myDiary;
    private final ArrayList<String> diaryItems = new ArrayList<>();

    @BeforeEach
    public void setUp(){
        myDiary = new DiaryList();
        DiaryItems test_Data = new DiaryItems();
        diaryItems.add(test_Data.setDiaryContent("Test Data"));
        diaryItems.add(test_Data.setDiaryContent("Test Data2"));
        diaryItems.add(test_Data.getDiaryContent());
        myDiary.setDiaryItems(diaryItems);
    }

    @Test
    @DisplayName("Test to affirm that Object Exist")
    public void test_ToAffirmThatObjectExist(){
        assertNotNull(myDiary);

    }

    @Test
    @DisplayName("Test that new Data could be written into Diary ")
    public void test_ToAffirmThatNewDataCouldBeWrittenIntoDiary(){
        //Given
        DiaryItems test_Data = new DiaryItems();

        //Assertions
        assertEquals("Test Data" , diaryItems.get(0));
        assertEquals("Test Data2" , diaryItems.get(1));

    }

}
