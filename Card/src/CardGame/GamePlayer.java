
package CardGame;

/**
 * display a deck of cards
 * @author Megha Patel
 */
public class GamePlayer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CardHand ch=new CardHand();
        ch.generateHand();
        
        for(Card c: ch.cards)
        {
            System.out.println(c.getSuit()+"of "+ c.getValue());
        }
        
    }

}
