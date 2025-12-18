import java.awt.*;
import java.util.Random;

public class Ball {
    static final int SIZE = 10;
    int x;
    int y;
    boolean right = true;
    boolean down = true;
    Color color;
    private Random random = new Random();

    Ball(int x, int y){
        this.x = x;
        this.y = y;
        this.color = new Color(random.nextInt(256),
                random.nextInt(256)
                ,random.nextInt(256));
    }

    void move(int width, int height){
        if (x > width - SIZE)
            right = false;
        if (x <= 0)
            right = true;
        if (y > height - SIZE)
            down = false;
        if (y <= 0)
            down = true;
        if (right)
            x += 10;
        else
            x -= 10;
        if (down)
            y += 10;
        else
            y -= 10;
    }
}
