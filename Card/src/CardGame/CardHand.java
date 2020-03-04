
package CardGame;

/** This class generates a deck of cards.
 *
 * @author Megha Patel
 */
public class CardHand {
    private int handSize=52;
    Card[] cards=new Card[handSize];
    
   public void generateHand()
   {
       int count=0;
       for(Card.Suit s:Card.Suit.values())
        {
            for(Card.Value v:Card.Value.values())
            {
                cards[count]=new Card(s,v);
                count++;
            }
        }
   }
    
    
    

}
