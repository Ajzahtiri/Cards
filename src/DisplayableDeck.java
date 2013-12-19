
import java.awt.*;
import javax.swing.*;


public class DisplayableDeck extends Deck implements Displayable {
    private Image image;
    private String filename = "";
    
    public DisplayableDeck(int cn) {
        if (cn == 1)
        {
            filename = "\\images\\classic-cards\\b2fv.png";
        } 
    }

    @Override
    public void display(Graphics g, int x, int y) {
        image = new ImageIcon(getClass().getResource(filename)).getImage();
        g.drawImage(image, 0, 0, null);        
    }
    
    public String getCardImage() {
        return filename;
    }
    
}
