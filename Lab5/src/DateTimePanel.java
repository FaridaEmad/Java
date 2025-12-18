import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class DateTimePanel extends JPanel implements Runnable{
    Thread th;

    public DateTimePanel() {
        th = new Thread(this);
        th.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Date d = new Date();
        g.drawString(d.toString(),50,100);
    }

    @Override
    public void run() {
        while (true){
            try{
                repaint();
                Thread.sleep(1000);
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }
}
