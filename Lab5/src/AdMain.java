import javax.swing.*;

public class AdMain {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Advertising");
        AdPanel p = new AdPanel();
        frame.setContentPane(p);
        frame.setSize(400,200);
        frame.setVisible(true);
    }
}
