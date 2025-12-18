import javax.swing.*;
import java.awt.*;

public class MyPanelGraphics extends JPanel {
    private Font[] fonts;

    public MyPanelGraphics() {
        GraphicsEnvironment g = GraphicsEnvironment.getLocalGraphicsEnvironment();
        fonts = g.getAllFonts();
    }

    @Override
    public void paint(Graphics g) {
        for (int i = 0; i < fonts.length; i++) {
            Font f = new Font(fonts[i].getName(),Font.BOLD,20);
            g.setFont(f);
            String name = fonts[i].getName();
            g.drawString(name,200,(i*2+1)*20);
        }
    }
}
