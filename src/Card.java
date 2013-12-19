import java.util.*;

public class Card {
    
    Random randomGenerator = new Random();
    private Rank rank;
    private Suit suit;

    public Card(Rank theRank, Suit theSuit){
		rank = theRank; 
		suit = theSuit;
    }
    
    public Card(int r, int s) {
        if (r == 1) {
            rank = Rank.Ace;
        } else if (r == 2) {
            rank = Rank.Two;
        } else if (r == 3) {
            rank = Rank.Three;
        } else if (r == 4) {
            rank = Rank.Four;
        } else if (r == 5) {
            rank = Rank.Five; 
        } else if (r == 6) {
            rank = Rank.Six;
        } else if (r == 7) {
            rank = Rank.Seven;
        } else if (r == 8) {
            rank = Rank.Eight;
        } else if (r == 9) {
            rank = Rank.Nine;
        } else if (r == 10) {
            rank = Rank.Ten;
        } else if (r == 11) {
            rank = Rank.Jack;
        } else if (r == 12) {
            rank = Rank.Queen;
        } else if (r == 13) {
            rank = Rank.King;
        }
        
        if (s == 1) {
            suit = Suit.Spades;
        } else if (s == 2) {
            suit = Suit.Diamonds;
        } else if (s == 3) {
            suit = Suit.Hearts;
        } else if (s == 4) {
            suit = Suit.Clubs;
        }      
    }
    
    public Card() {
        int rankk = randomGenerator.nextInt(10);
        if (rankk == 0) {
            rank = Rank.Ace;
        } else if (rankk == 1) {
            rank = Rank.Two;
        } else if (rankk == 2) {
            rank = Rank.Three;
        } else if (rankk == 3) {
            rank = Rank.Four;
        } else if (rankk == 4) {
            rank = Rank.Five; 
        } else if (rankk == 5) {
            rank = Rank.Six;
        } else if (rankk == 6) {
            rank = Rank.Seven;
        } else if (rankk == 7) {
            rank = Rank.Eight;
        } else if (rankk == 8) {
            rank = Rank.Nine;
        } else if (rankk == 9) {
            int rankkk = randomGenerator.nextInt(4);
            if (rankkk == 0) {
                rank = Rank.Ten;
            } else if (rankkk == 1) {
                rank = Rank.Jack;
            } else if (rankkk == 2) {
                rank = Rank.Queen;
            } else if (rankkk == 3) {
                rank = Rank.King;
            }
        }
        
        int suitt = randomGenerator.nextInt(4);
        if (suitt == 0) {
            suit = Suit.Clubs;
        } else if (suitt == 1) {
            suit = Suit.Hearts;
        } else if (suitt == 2) {
            suit = Suit.Diamonds;
        } else if (suitt == 3) {
            suit = Suit.Spades;
        }        
    }

    public Rank getRank() { 
        return rank; 
    } 
    
    public Suit getSuit(){ 
        return suit; 
    }
    
    public String toString(){ 
        return (rank + " of " + suit); 
    }  
    
}
