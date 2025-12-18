import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class CollisionPanel extends JPanel implements Runnable {
    Thread th;
    private ArrayList<Ball> balls = new ArrayList<>();

    public CollisionPanel() {
        balls.add(new Ball(0,0));
        balls.add(new Ball(100,100));
        th = new Thread(this);
        th.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (Ball b : balls){
            g.setColor(b.color);
            g.fillOval(b.x,b.y,Ball.SIZE,Ball.SIZE);
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                moveBalls();
                checkCollision();
                repaint();
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    private void moveBalls(){
        for (Ball b : balls){
            b.move(getWidth(),getHeight());
        }
    }

    private void checkCollision(){
        for (int i = 0; i < balls.size(); i++) {
            for (int j = i + 1; j < balls.size(); j++) {

                Ball b1 = balls.get(i);
                Ball b2 = balls.get(j);

                int dx = b1.x - b2.x;
                int dy = b1.y - b2.y;
                int distanceSquared = dx * dx + dy * dy;
                int radius = Ball.SIZE;

                if (distanceSquared <= radius * radius) {
                    newBall();
                    return;
                }
            }
        }
    }
    private void newBall(){
        Random random = new Random();
        int x = random.nextInt(Math.max(getWidth()-Ball.SIZE,1));
        int y = random.nextInt(Math.max(getHeight()-Ball.SIZE,1));
        balls.add(new Ball(x,y));
    }
}
