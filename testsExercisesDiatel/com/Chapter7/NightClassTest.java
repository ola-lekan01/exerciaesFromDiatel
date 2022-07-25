package com.Chapter7;

import com.Chapter7.Turtle.NightClass;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class NightClassTest {
    private NightClass nightClass;

    @BeforeEach
    public void inItSetUp(){
        nightClass = new NightClass();
    }
    @Test
    @DisplayName("To test that Object Exist")
    public void test_ThatObjectExist(){
        assertNotNull(nightClass);
    }
    @Test
    @DisplayName("To test that Night Class is awesome")
    public void test_ThatNightClassTestIsAwesome(){
        assertEquals(6 , NightClass.incrementNumber(5));
    }
    @Test
    @DisplayName("To Test That Numbers are Equal")
    public void test_ToTestThatNumbersAreEquals(){
        assertTrue(NightClass.equalsNumber(5,5));
    }
    @Test
    @DisplayName("To Test The Differences in Numbers")
    public void test_ToTestTheDifferencesInNumber(){
        assertEquals(30, NightClass.calculateDifferences(3,33));
    }

    @Test
    @DisplayName("To Test Minutes can be converted to Seconds")
    public void test_ToTestNumberCanBeConvertedToSeconds(){
        assertEquals(600, NightClass.convertToSeconds(10));
    }
    @Test
    @DisplayName("To Test The Sum of two Numbers")
    public void test_ToTestTheSumOfTwoNumbers(){
        assertEquals(72, NightClass.addNumbers(4,68));
    }
    @Test
    @DisplayName("To Test The Alphabet Of A String")
    public void test_ToFindTheAlphabetOfAString(){
        assertEquals('e' , nightClass.getString("Kelechi"));
    }
    @Test
    @DisplayName("To Test The Next Alphabet")
    public void test_ToFindTheNextAlphabet(){
        assertEquals('h' , nightClass.getChar('g'));
    }
    @Test
    @DisplayName("Test guess Continent Name")
    public void test_ToGuessContinentName(){

    }
}