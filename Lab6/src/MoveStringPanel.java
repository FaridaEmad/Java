import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MoveStringPanel extends JPanel implements Runnable {
    private int x = 150;
    private int y = 150;
    private final String text = "Java";
    private Thread th;

    public MoveStringPanel() {
        setFocusable(true);

        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();
                switch (key){
                    case KeyEvent.VK_LEFT -> x -= 5;
                    case KeyEvent.VK_RIGHT -> x += 5;
                    case KeyEvent.VK_UP -> y -= 5;
                    case KeyEvent.VK_DOWN -> y += 5;
                }
            }
        });

        th = new Thread(this);
        th.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setFont(new Font("Arial",Font.BOLD|Font.ITALIC,25));
        g.setColor(Color.MAGENTA);
        g.drawString(text,x,y);
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
