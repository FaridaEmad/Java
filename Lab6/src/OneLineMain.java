import javax.swing.*;

public class OneLineMain {
    public static void main(String[] args) {
        JFrame frame = new JFrame("One Line");
        OneLinePanel p = new OneLinePanel();
        frame.setContentPane(p);
        frame.setSize(400,400);
        frame.setVisible(true);
    }
}
