
package CardGame;

/** This class is a model class for Card
 *
 * @author Megha Patel
 */
public class Card {
    
    public enum Suit{SPADES,DIAMONDS,CLUBS,HEARTS};
    public enum Value{ACE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,
                      JACK,QUEEN,KING};
    
         private final Suit suit;
         private final Value value;
         
         public Card(Suit s, Value v)
         {
             suit=s;
             value=v;
         }

    /**
     * @return the suit
     */
    public Suit getSuit() {
        return suit;
    }

    
    /**
     * @return the value
     */
    public Value getValue() {
        return value;
    }

    
}
