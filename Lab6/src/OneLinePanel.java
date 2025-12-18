import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;

public class OneLinePanel extends JPanel implements Runnable{
    private Line l = new Line();
    Thread th;
    private boolean dragging = false;

    public OneLinePanel() {
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                l.startX = e.getX();
                l.startY = e.getY();
                l.endX = l.startX;
                l.endY = l.startY;
                dragging = true;
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                l.endX = e.getX();
                l.endY = e.getY();
                dragging = false;
            }
        });

        this.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if (dragging){
                    l.endX = e.getX();
                    l.endY = e.getY();
                }
            }
        });
        th = new Thread(this);
        th.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLACK);
        g.drawLine(l.startX,l.startY,l.endX,l.endY);
    }

    @Override
    public void run() {
        while (true){
            repaint();
            try {
                Thread.sleep(10);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
