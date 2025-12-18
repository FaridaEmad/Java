import javax.swing.*;

public class MoveStringMain {
    public static void main(String[] args) {
        JFrame frame = new JFrame("String Move");
        MoveStringPanel p = new MoveStringPanel();
        frame.setContentPane(p);
        frame.setSize(400,400);
        frame.setVisible(true);
    }
}
