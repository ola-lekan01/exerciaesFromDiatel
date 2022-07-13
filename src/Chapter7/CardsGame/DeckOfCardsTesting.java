package Chapter7.CardsGame;

public class DeckOfCardsTesting {
    public static void main(String[] args) {
        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle();

        for(int counter = 0 ; counter <= 52 ; counter++){
            System.out.printf(" %-20s " , myDeckOfCards.dealCards());

            if(counter % 4 == 0){
                System.out.println(" ");
            }
        }

    }
}
