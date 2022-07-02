package chapter5;

public class TestDriller {

    public int calculatePrice(int quantityOfBooksBought) {
        int price;

        if(quantityOfBooksBought >= 1 && quantityOfBooksBought <= 4){
            price = quantityOfBooksBought * 2000;
        }
        else if(quantityOfBooksBought >= 5 && quantityOfBooksBought <= 9){
            price = quantityOfBooksBought * 1800;
        }
        else if(quantityOfBooksBought >= 10 && quantityOfBooksBought <= 29){
            price = quantityOfBooksBought * 1600;
        }
        else if(quantityOfBooksBought >= 39 && quantityOfBooksBought <= 49){
            price = quantityOfBooksBought * 1500;
        }
       else if(quantityOfBooksBought >= 50 && quantityOfBooksBought <= 99){
            price = quantityOfBooksBought * 1300;
        }
        else if(quantityOfBooksBought >= 100 && quantityOfBooksBought <= 199){
            price = quantityOfBooksBought * 1200;
        }
        else if(quantityOfBooksBought >= 200 && quantityOfBooksBought <= 499){
            price = quantityOfBooksBought * 1100;
        }
        else {
            price = quantityOfBooksBought * 1000; }

            return price;
        }
}
