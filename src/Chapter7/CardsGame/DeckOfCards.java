package Chapter7.CardsGame;

import java.security.SecureRandom;

public class DeckOfCards {
    private static final SecureRandom secureRandom = new SecureRandom();
    private static final int NUMBER_OF_CARDS = 52;

    private Cards[] deck = new Cards[NUMBER_OF_CARDS];
    private int currentCard = 0;

    public DeckOfCards(){
        String [] faces = {"Ace" , "Deuces" , "Three" ,"Four" , "Five" , "Six" , "Seven" , "Eight" , "Nine" , "Ten" , "Jack" , "King" , "Queen"};
        String [] suits ={ "Hearts" , "Diamonds" , "Clubs" , "Spades"};

        for(int count = 1 ; count < deck.length ; count++){
            deck[count] = new Cards (faces[count % 13] , suits[count / 13]);
        }
    }
    public void shuffle(){
        currentCard = 0;
        for(int first = 1 ; first < deck.length ; first++){
            int second = secureRandom.nextInt(NUMBER_OF_CARDS);

            Cards temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;

        }
    }
    public Cards dealCards(){
        if (currentCard < deck.length){
            return deck[currentCard++];
        }
        else {
            return null;
        }
    }

}
