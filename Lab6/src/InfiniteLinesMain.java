import javax.swing.*;

public class InfiniteLinesMain {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Three Line");
        InfiniteLinesPanel p = new InfiniteLinesPanel();
        frame.setContentPane(p);
        frame.setSize(400,400);
        frame.setVisible(true);
    }
}
