
/**
 * Write a description of class Card here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Card
{
    // instance variables - replace the example below with your own
    private int value;
    private String suit;
    private String rank;

    /**
     * Constructor for objects of class Card
     */
    public Card(int val, String su, String r)
    {
        this.value = val;
        this.suit = su;
        this.rank = r;
    }

    public int getValue() {
        return this.value;
    }
    
    public String getSuit() {
        return this.suit;
    }
    
    public String toString() {
        return "Suit: " + this.suit + " Rank: " + this.rank + " Value: " + this.value;
    }
}
