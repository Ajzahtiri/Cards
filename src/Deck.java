
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class Deck {
    private ArrayList<Card> cards;
    private ArrayList<Card> missing;
    
       public Deck() {    
           cards = new ArrayList();
           missing = new ArrayList();
           int x = 0;
           for (int a = 1; a < 5; a++) {
               for (int b = 1; b < 14; b++) {
                   cards.add(new Card(b, a));
                   x++;
               }
           }           
       }
       
       public int getNumOfCardsInDeck()
       {
           return cards.size();
       }
       
       public int getNumOfCardsUsed()
       {
           return missing.size();
       }
       
       public Card getCard()
       {
           Random rand = new Random();
           int r = rand.nextInt(cards.size());
           
           missing.add(cards.get(r));
           Card temp = cards.get(r);
           cards.remove(r);
           
           return temp;
       }
       
       public void returnMissing()
       {
           cards.addAll(missing);
           missing.clear();
       }
       
       
       
       public void shuffle() 
       {
           Collections.shuffle(cards);
       }
       
       @Override       
       public String toString() {
           for (int i = 0; i < 52; i++) {
               System.out.println(cards.get(i).toString());
           }
           return "Complete.";
       }
}
       

