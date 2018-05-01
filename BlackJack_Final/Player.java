
/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Random;

public class Player 
{
    // instance variables - replace the example below with your own
    private String name;
    private int money;
    private int handTotal;
    ArrayList<Card> hand = new ArrayList<Card>();
    Random rand = new Random();

    /**
     * Constructor for objects of class Player
     */
    public Player(String nm, int m)
    {
        // initialise instance variables
        this.name = nm;
        this.money = m;
    }
    
    public void bet(int betAmount) {
        money = this.money - betAmount;
    }
    
    public void hit(Card c) {
        hand.add(c);
    }
    
    public void stay() {
        System.out.println("You stayed");
    }
    
    public int getHandTotal() {
        int total = 0;
        for(Card c : hand) {
            total += c.getValue();
        }
        return total;
    }
    
    public String toString() {
        String output = "Your hand contains: ";
        for(Card c: hand) {
            output += c.toString() + "\n";
        }
        output += " Your total is: " + getHandTotal();
        return output;
    }
}
