
/**
 * Write a description of class Deck here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;

public class Deck
{
    // instance variables - replace the example below with your own
    Card[] deck = new Card[52];
    String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
    int count = -1;

    /**
     * Constructor for objects of class Deck
     */
    public Deck()
    {
        // initialise instance variables
        initializeDeck();
        shuffle();
    }
    
    public void initializeDeck() {
        int x = 0;
        for(int j = 0; j < 4; j++) {
                for(int k = 0; k < 13; k++) {
                    deck[x] = new Card(values[k], suits[j], ranks[k]);
                    x++;
                }
            }
    }

    public void shuffle() {
        for(int i = 0; i < deck.length; i++) {
            Card tempCard = deck[i];
            int index = (int) Math.random()*52;
            deck[i] = deck[index];
            deck[index] = tempCard;
            }
    }
    
    public Card deal() {
        count = (int) (Math.random() * 52);
        return deck[count];
    }
}
