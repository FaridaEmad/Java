import javax.swing.*;
import java.awt.*;

public class AdPanel extends JPanel implements Runnable {
    Thread th;
    private int x = 200;
    private int y = 100;
    public AdPanel() {
        th = new Thread(this);
        th.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("Java World",this.x,this.y);
    }

    @Override
    public void run() {
        while (true){
            try{
                if(this.x >= getWidth()){
                    this.x=0;
                }
                this.x += 10;
                repaint();
                Thread.sleep(500);
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }

        }
    }
}
