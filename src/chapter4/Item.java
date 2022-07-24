package chapter4;

public class Item {
    private double valueSold;

    public Item(){
    }

    public Item(double valueSold){
        this.valueSold = valueSold;
    }

    public double getValueSold() {
        return valueSold;
    }

    public void setValueSold(double valueSold) {
        this.valueSold = valueSold;
    }
}
