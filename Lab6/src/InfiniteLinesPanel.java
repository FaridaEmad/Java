import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;

public class InfiniteLinesPanel extends JPanel implements Runnable{
    private ArrayList<Line> lines = new ArrayList<>();
    private int startX;
    private int startY;
    private int tempX;
    private int tempY;
    Thread th;
    private boolean dragging = false;

    public InfiniteLinesPanel() {
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                startX = e.getX();
                startY = e.getY();
                tempX = startX;
                tempY = startY;
                dragging = true;
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if(dragging){
                    lines.add(new Line(startX,startY,e.getX(),e.getY()));
                    dragging = false;
                }
            }
        });

        this.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if (dragging){
                    tempX = e.getX();
                    tempY = e.getY();
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
        for (Line line: lines) {
            line.draw(g);
        }
        if (dragging){
            g.setColor(Color.RED);
            g.drawLine(startX,startY,tempX,tempY);
        }
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
