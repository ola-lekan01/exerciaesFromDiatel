package chapter4;

import java.math.BigDecimal;

public class SalesPerson {
    private Item[] soldItems;

    public Item[] getSoldItems() {
        return soldItems;
    }

    public void setSoldItems(Item[] soldItems) {
        this.soldItems = soldItems;
    }
    public double calculateEarnings(){
        double commission = BigDecimal.ZERO.doubleValue();
        for (Item soldItem : soldItems) {
            double COMMISSION_RATE = 0.09;
            commission += soldItem.getValueSold() * COMMISSION_RATE;
        }
        double WEEKLY_PAY = 200;
        return commission + WEEKLY_PAY;
    }
}
