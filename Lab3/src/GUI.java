import javax.swing.*;

public class GUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello Java");
        MyPanel panel = new MyPanel();
        frame.setContentPane(panel);
        frame.setSize(600,600);
        frame.setVisible(true);
    }
}
