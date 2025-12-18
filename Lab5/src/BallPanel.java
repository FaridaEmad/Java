import javax.swing.*;
import java.awt.*;

public class BallPanel extends JPanel implements Runnable {
    Thread th;
    private int x = 0;
    private int y = 0;

    public BallPanel() {
        th = new Thread(this);
        th.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(this.x, this.y, 10, 10);
    }

    @Override
    public void run() {
        boolean isRight = true;
        boolean isDown = true;
        while (true) {
            try {
                if (this.x >= getWidth()-10) {
                    isRight = false;
                } else if (this.x <= 0) {
                    isRight = true;
                }
                if (this.y >= getHeight()-10) {
                    isDown = false;
                } else if (this.y <= 0) {
                    isDown = true;
                }
                if (isRight)
                    this.x += 10;
                else
                    this.x -= 10;
                if (isDown)
                    this.y += 10;
                else
                    this.y -= 10;
                repaint();
                Thread.sleep(100);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }

        }
    }
}