package chapter5;

/* Test driller is a CBT software for UTME students.
You are tasked with providing a method for resellers that help them calculate the amount they will need to pay per unit.
Create a method that takes the number of unit and return the price payable. */


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestDrillerApplication {

    TestDriller drillerCalculator;

    @BeforeEach
    void setup(){ drillerCalculator = new TestDriller();}


    @Test
    @DisplayName("To test that Object Exist")

    void testThatObjectExist(){

        assertNotNull(drillerCalculator);
    }
    @Test
    @DisplayName("To Test That Application can calculate price for Test Driller")
    void toTestThatApplicationCanCalculatePriceForaQuantityOfTestDriller(){
        int price = drillerCalculator.calculatePrice(1);
        assertEquals(2000 , price);
    }

    @Test
    @DisplayName("To Test That Application can calculate price for 4 quantityTest Driller")
    void toTestThatApplicationCanCalculatePriceFor4QuantityTestDriller(){
        int price = drillerCalculator.calculatePrice(4);
        assertEquals(8000 , price);
    }
    @Test
    @DisplayName("To Test That Application can calculate price for 7 Quantity Test Driller")
    void toTestThatApplicationCanCalculatePriceFor7QuantityTestDriller(){
        int price = drillerCalculator.calculatePrice(7);
        assertEquals(12600 , price);
    }
    @Test
    @DisplayName("To Test That Application can calculate price for 18 Quantity Test Driller")
    void toTestThatApplicationCanCalculatePriceFor18QuantityTestDriller(){
        int price = drillerCalculator.calculatePrice(18);
        assertEquals(28800 , price);
    }
    @Test
    @DisplayName("To Test That Application can calculate price for 49 Quantity Test Driller")
    void toTestThatApplicationCanCalculatePriceFor49QuantityTestDriller(){
        int price = drillerCalculator.calculatePrice(49);
        assertEquals(73500 , price);
    }
    @Test
    @DisplayName("To Test That Application can calculate price for 199 Quantity Test Driller")
    void toTestThatApplicationCanCalculatePriceFor199QuantityTestDriller(){
        int price = drillerCalculator.calculatePrice(199);
        assertEquals(238800 , price);
    }
    @Test
    @DisplayName("To Test That Application can calculate price for 200 Quantity Test Driller")
    void toTestThatApplicationCanCalculatePriceFor200TestDriller(){
        int price = drillerCalculator.calculatePrice(200);
        assertEquals(220000 , price);
    }
    @Test
    @DisplayName("To Test That Application can calculate price for 2000 Quantity Test Driller")
    void toTestThatApplicationCanCalculatePriceForTestDriller(){
        int price = drillerCalculator.calculatePrice(2000);
        assertEquals(2000000 , price);

    }

}
