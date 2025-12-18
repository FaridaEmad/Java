import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        g.drawString("Hello Java <3!",250,250);
    }
}
