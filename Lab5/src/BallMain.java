import javax.swing.*;

public class BallMain {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ball");
        BallPanel p = new BallPanel();
        frame.setContentPane(p);
        frame.setSize(400,300);
        frame.setVisible(true);
    }
}
