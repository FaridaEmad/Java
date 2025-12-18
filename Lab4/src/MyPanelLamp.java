import javax.swing.*;
import java.awt.*;

public class MyPanelLamp extends JPanel {
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.PINK);
        g.fillOval(200,50,200,50);
        g.setColor(Color.BLACK);
        g.drawOval(200,50,200,50);
        g.drawLine(200,75,150,275);
        g.drawLine(400,75,450,275);
        g.drawArc(150,250,300,50,180,180);
        g.setColor(Color.PINK);
        g.fillOval(185,175,50,75);
        g.setColor(Color.BLACK);
        g.drawOval(185,175,50,75);
        g.setColor(Color.PINK);
        g.fillOval(365,175,50,75);
        g.setColor(Color.BLACK);
        g.drawOval(365,175,50,75);
        g.setColor(Color.PINK);
        g.fillOval(262,125,75,150);
        g.setColor(Color.BLACK);
        g.drawOval(262,125,75,150);
        g.drawLine(290,300,275,450);
        g.drawLine(310,300,325,450);
        g.setColor(Color.pink);
        g.fillRect(200,450,200,25);
        g.setColor(Color.BLACK);
        g.drawRect(200,450,200,25);
    }
}
