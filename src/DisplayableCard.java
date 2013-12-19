import java.awt.*;
import javax.swing.*;


public class DisplayableCard extends Card implements Displayable {
    private Image image;
    private String imageFilename;
    
    public DisplayableCard(Rank r, Suit s)
    {
        super(r, s);
        
        if (s == Suit.Clubs) 
        {
            if (r== Rank.Ace) {
                imageFilename = "\\images\\classic-cards\\0.png";
            }
            if (r== Rank.Two) {
                imageFilename = "\\images\\classic-cards\\1.png";
            }
            if (r== Rank.Three) {
                imageFilename = "\\images\\classic-cards\\2.png";
            }
            if (r== Rank.Four) {
                imageFilename = "\\images\\classic-cards\\3.png";
            }
            if (r== Rank.Five) {
                imageFilename = "\\images\\classic-cards\\4.png";
            }
            if (r== Rank.Six) {
                imageFilename = "\\images\\classic-cards\\5.png";
            }
            if (r== Rank.Seven) {
                imageFilename = "\\images\\classic-cards\\6.png";
            }
            if (r== Rank.Eight) {
                imageFilename = "\\images\\classic-cards\\7.png";
            }
            if (r== Rank.Nine) {
                imageFilename = "\\images\\classic-cards\\8.png";
            }
            if (r== Rank.Ten) {
                imageFilename = "\\images\\classic-cards\\9.png";;
            }
            if (r== Rank.Jack) {
                imageFilename = "\\images\\classic-cards\\10.png";
            }
            if (r== Rank.Queen) {
                imageFilename = "\\images\\classic-cards\\11.png";
            }
            if (r== Rank.King) {
                imageFilename = "\\images\\classic-cards\\12.png";
            } 
        }
            
        if (s == Suit.Spades) 
        {
            if (r== Rank.Ace) {
                imageFilename = "\\images\\classic-cards\\13.png";
            }
            if (r== Rank.Two) {
                imageFilename = "\\images\\classic-cards\\14.png";
            }
            if (r== Rank.Three) {
                imageFilename = "\\images\\classic-cards\\15.png";
            }
            if (r== Rank.Four) {
                imageFilename = "\\images\\classic-cards\\16.png";
            }
            if (r== Rank.Five) {
                imageFilename = "\\images\\classic-cards\\17.png";
            }
            if (r== Rank.Six) {
                imageFilename = "\\images\\classic-cards\\18.png";
            }
            if (r== Rank.Seven) {
                imageFilename = "\\images\\classic-cards\\19.png";
            }
            if (r== Rank.Eight) {
                imageFilename = "\\images\\classic-cards\\20.png";
            }
            if (r== Rank.Nine) {
                imageFilename = "\\images\\classic-cards\\21.png";
            }
            if (r== Rank.Ten) {
                imageFilename = "\\images\\classic-cards\\22.png";;
            }
            if (r== Rank.Jack) {
                imageFilename = "\\images\\classic-cards\\23.png";
            }
            if (r== Rank.Queen) {
                imageFilename = "\\images\\classic-cards\\24.png";
            }
            if (r== Rank.King) {
                imageFilename = "\\images\\classic-cards\\25.png";
            } 
        }
        
        if (s == Suit.Hearts)  
        {
            if (r== Rank.Ace) {
                imageFilename = "\\images\\classic-cards\\26.png";
            }
            if (r== Rank.Two) {
                imageFilename = "\\images\\classic-cards\\27.png";
            }
            if (r== Rank.Three) {
                imageFilename = "\\images\\classic-cards\\28.png";
            }
            if (r== Rank.Four) {
                imageFilename = "\\images\\classic-cards\\29.png";
            }
            if (r== Rank.Five) {
                imageFilename = "\\images\\classic-cards\\30.png";
            }
            if (r== Rank.Six) {
                imageFilename = "\\images\\classic-cards\\31.png";
            }
            if (r== Rank.Seven) {
                imageFilename = "\\images\\classic-cards\\32.png";
            }
            if (r== Rank.Eight) {
                imageFilename = "\\images\\classic-cards\\33.png";
            }
            if (r== Rank.Nine) {
                imageFilename = "\\images\\classic-cards\\34.png";
            }
            if (r== Rank.Ten) {
                imageFilename = "\\images\\classic-cards\\35.png";;
            }
            if (r== Rank.Jack) {
                imageFilename = "\\images\\classic-cards\\36.png";
            }
            if (r== Rank.Queen) {
                imageFilename = "\\images\\classic-cards\\37.png";
            }
            if (r== Rank.King) {
                imageFilename = "\\images\\classic-cards\\38.png";
            } 
        }
        
        if (s == Suit.Diamonds) 
        {
            if (r== Rank.Ace) {
                imageFilename = "\\images\\classic-cards\\39.png";
            }
            if (r== Rank.Two) {
                imageFilename = "\\images\\classic-cards\\40.png";
            }
            if (r== Rank.Three) {
                imageFilename = "\\images\\classic-cards\\41.png";
            }
            if (r== Rank.Four) {
                imageFilename = "\\images\\classic-cards\\42.png";
            }
            if (r== Rank.Five) {
                imageFilename = "\\images\\classic-cards\\43.png";
            }
            if (r== Rank.Six) {
                imageFilename = "\\images\\classic-cards\\44.png";
            }
            if (r== Rank.Seven) {
                imageFilename = "\\images\\classic-cards\\45.png";
            }
            if (r== Rank.Eight) {
                imageFilename = "\\images\\classic-cards\\46.png";
            }
            if (r== Rank.Nine) {
                imageFilename = "\\images\\classic-cards\\47.png";
            }
            if (r== Rank.Ten) {
                imageFilename = "\\images\\classic-cards\\48.png";;
            }
            if (r== Rank.Jack) {
                imageFilename = "\\images\\classic-cards\\49.png";
            }
            if (r== Rank.Queen) {
                imageFilename = "\\images\\classic-cards\\50.png";
            }
            if (r== Rank.King) {
                imageFilename = "\\images\\classic-cards\\51.png";
            } 
        }
    }

    @Override
    public void display(Graphics g, int x, int y) {
        image = new ImageIcon(getClass().getResource(imageFilename)).getImage();
        g.drawImage(image, 0, 0, null);        
    }
    
    public String getCardImage() {
        return imageFilename;
    }
    
    
}
