import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Java Fonts");
        MyPanel panel = new MyPanel();
        frame.setContentPane(panel);
        frame.setSize(600,600);
        frame.setVisible(true);
    }
}