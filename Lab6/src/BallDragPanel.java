import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class BallDragPanel extends JPanel implements Runnable {
    private int ovalX = 100;
    private int ovalY = 100;
    private final int SIZE = 25;
    private boolean dragging = false;
    Thread th;
    private int offsetX;
    private int offsetY;

    public BallDragPanel() {
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (new Rectangle(ovalX,ovalY,SIZE,SIZE).contains(e.getPoint())){
                    dragging = true;
                    offsetX = e.getX()-ovalX;
                    offsetY = e.getY()-ovalY;
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                dragging = false;
            }
        });

        this.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                ovalX = e.getX()-offsetX;
                ovalY = e.getY()-offsetY;
            }
        });

        th = new Thread(this);
        th.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.GREEN);
        g.fillOval(ovalX,ovalY,SIZE,SIZE);
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
