import javax.swing.*;

public class ThreeLineMain {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Three Line");
        ThreeLinePanel p = new ThreeLinePanel();
        frame.setContentPane(p);
        frame.setSize(400,400);
        frame.setVisible(true);
    }
}
