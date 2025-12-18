import java.awt.*;

public class Line {
    int startX = 0;
    int startY = 0;
    int endX = 0;
    int endY = 0;

    public Line() {
    }

    public Line(int startX, int startY, int endX, int endY) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }

    public void draw(Graphics g){
        g.drawLine(this.startX,this.startY,this.endX,this.endY);
    }
}
