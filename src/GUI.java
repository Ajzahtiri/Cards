import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GUI extends JFrame implements ActionListener {
    
    private CardGamePanel[] cgp = new CardGamePanel[6];
    private Displayable[] dc = new Displayable[6];
    Deck deck = new Deck();
    Hand yourHand = new Hand();
    Hand evilHand = new Hand();
    private JButton shuffle, redraw, returnn;
    private JLabel used, inDeck, message;
    JPanel cards = new JPanel();
    
    public GUI()
    {
        super("Cards!");
        JPanel p = new JPanel();
        shuffle = new JButton("Shuffle");
        shuffle.addActionListener(this);
        redraw = new JButton("Draw");
        redraw.addActionListener(this);
        returnn = new JButton("Return");
        returnn.addActionListener(this);
        used = new JLabel(deck.getNumOfCardsUsed() + " cards used.");
        inDeck = new JLabel(deck.getNumOfCardsInDeck() + " cards in deck.");
        message = new JLabel("It's time to play a simple game of cards!");
        
        cards.setLayout(new GridLayout(1, 1));

        dc[0] = new DisplayableDeck(1);  
        
        for (int i = 0; i < cgp.length; i++)
        {
            cgp[i] = new CardGamePanel();
            cgp[i].setItem(dc[i], i, i);
            
            if (i == 0)
            {
                cards.add(cgp[i]);
            }
        }
        
        p.add(used);
        p.add(inDeck);
        p.add(shuffle);
        p.add(redraw);
        p.add(returnn);
        
        p.add(message);
        
        getContentPane().add(cards, BorderLayout.CENTER);
        getContentPane().add(p, BorderLayout.SOUTH);
        this.setSize(680, 201);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == shuffle)
        {
            deck.shuffle();
        }
        else if (e.getSource() == redraw)
        {      
            if (deck.getNumOfCardsInDeck() >= 10)
            {
                yourHand.resetScore();
                evilHand.resetScore();
                for (int i = 1; i < 6; i++)
                {                
                    yourHand.resetCards();
                    cards.remove(cgp[i]);
                    Card nc = deck.getCard();
                    yourHand.addCard(nc);
                    dc[i] = new DisplayableCard(nc.getRank(), nc.getSuit());
                    cgp[i] = new CardGamePanel();
                    cgp[i].setItem(dc[i], i, i);
                    cards.add(cgp[i]);
                    cards.revalidate();
                    repaint();
                }

                for (int i = 1; i < 6; i++)
                {
                    evilHand.resetCards();

                    Card nc = deck.getCard();
                    evilHand.addCard(nc);
                }
                
                used.setText(deck.getNumOfCardsUsed() + " cards used.");
                inDeck.setText(deck.getNumOfCardsInDeck() + " cards in deck.");

                if (yourHand.getScore() > evilHand.getScore())
                {
                    message.setText("You win! (Your score: " + yourHand.getScore() + " : Their score: " + evilHand.getScore() + ")");
                } 
                if (yourHand.getScore() == evilHand.getScore())
                {
                    message.setText("Stalemate! (Your score: " + yourHand.getScore() + " : Their score: " + evilHand.getScore() + ")");
                }
                if (yourHand.getScore() < evilHand.getScore())
                {
                    message.setText("You lose! (Your score: " + yourHand.getScore() + " : Their score: " + evilHand.getScore() + ")");                
                }
            }
            else
            {
                message.setText("Not enough cards! Return them to the deck!");
            }
        }
        
        if (e.getSource() == returnn)
        {
            yourHand.resetScore();
            evilHand.resetScore();
            if (deck.getNumOfCardsUsed() != 0)
            {
                message.setText("Readded " + deck.getNumOfCardsUsed() + " cards to the deck!");
                deck.returnMissing();
            }
            
            used.setText(deck.getNumOfCardsUsed() + " cards used.");
            inDeck.setText(deck.getNumOfCardsInDeck() + " cards in deck.");
            
            for (int i = 1; i < 6; i++)
            {
                cards.remove(cgp[i]);
                repaint();
            }
        }      
    }
}
