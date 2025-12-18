import javax.swing.*;

public class BallDragMain {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ball Drag");
        BallDragPanel p = new BallDragPanel();
        frame.setContentPane(p);
        frame.setSize(400,400);
        frame.setVisible(true);
    }
}
