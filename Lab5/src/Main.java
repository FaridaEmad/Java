import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("DateTime");
        DateTimePanel p = new DateTimePanel();
        frame.setContentPane(p);
        frame.setSize(300,200);
        frame.setVisible(true);
    }
}