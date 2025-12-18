import javax.swing.*;

public class CollisionMain {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Collision");
        CollisionPanel p = new CollisionPanel();
        frame.setContentPane(p);
        frame.setSize(400,300);
        frame.setVisible(true);
    }
}
