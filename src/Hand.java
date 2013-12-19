
import java.util.ArrayList;

public class Hand {
   
    public int totSco;
    private ArrayList<Card> theCards;
    private int numCards;
    private static final int max = 5;

    public Hand(){
        theCards = new ArrayList();
        numCards = 0;
    }
    
    public void addCard(Card aCard){ 
        if (numCards < max) {
            theCards.add(aCard);
            addScore(aCard);
        } 
    }
    
    public void resetCards()
    {
        theCards.clear();
    }
    
    
    public void resetScore()
    {
        this.totSco = 0;
    }
    
    public void addScore(Card aCard) {
        Rank cr = aCard.getRank();
        totSco += cr.getScore();
    }
    
    public int getScore() {
        return totSco;
    }
    
    @Override
    public String toString(){
       
       String s = ""; 
       s += ("Score of hand: " + getScore());
       for (int i = 0; i < numCards; ++i)  { 
		s += "\n" + theCards.get(i);
       }
       return s;
    }
}



