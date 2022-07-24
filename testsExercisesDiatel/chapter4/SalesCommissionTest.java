package chapter4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test For representing Sales Tax Commission
 * @@author Lekan Sofuyi
 */
public class SalesCommissionTest {

private SalesPerson james;
private Item iPhone;
private Item[] itemSold = new Item[1];

@BeforeEach
    void setUp(){
    james = new SalesPerson();
    Item iPhone = new Item(1000);
    itemSold[0] = iPhone;
    james.setSoldItems(itemSold);
}

@Test
    public void calculateEarnings(){
    assertEquals(1, james.getSoldItems().length);
    Item itemSold = james.getSoldItems()[0];
    assertEquals(1000, itemSold.getValueSold());
    assertEquals(290 , james.calculateEarnings());

}

}
