import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    private String[] fonts;

    public MyPanel() {
        Toolkit t = Toolkit.getDefaultToolkit();
        this.fonts = t.getFontList();
    }
    @Override
    public void paint(Graphics g) {
        for (int i = 0; i < fonts.length; i++) {
            Font f = new Font(fonts[i],Font.BOLD,20);
            g.setFont(f);
            String name = fonts[i];
            g.drawString(name,200,(i*2+1)*20);
        }
    }
}
