import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Increment & Decrement");
        ButtonPanel p = new ButtonPanel();
        frame.setContentPane(p);
        frame.setSize(400,400);
        frame.setVisible(true);
    }
}