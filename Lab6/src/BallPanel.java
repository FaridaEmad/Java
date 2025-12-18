import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BallPanel extends JPanel implements Runnable {
    Thread th;
    private int x = 175;
    private int y = 175;
    private boolean started = false;
    private boolean paused = true;
    private JButton start;
    private JButton pause;
    private final Object lock = new Object();

    public BallPanel() {
        start = new JButton("Start");
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                synchronized (lock){
                    paused = false;
                    lock.notify();
                }
                if (!started){
                    th = new Thread(BallPanel.this);
                    th.start();
                    started = true;
                }
            }
        });
        add(start);
        pause = new JButton("Pause");
        pause.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                synchronized (lock){
                    paused = true;
                }
            }
        });
        add(pause);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLUE);
        g.fillOval(this.x, this.y, 25, 25);
    }

    @Override
    public void run() {
        boolean isRight = true;
        boolean isDown = true;
        while (true) {
            synchronized (lock){
                while (paused){
                    try {
                        lock.wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
            try {
                if (this.x >= getWidth()-25) {
                    isRight = false;
                } else if (this.x <= 0) {
                    isRight = true;
                }
                if (this.y >= getHeight()-25) {
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