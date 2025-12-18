import javax.swing.*;

public class MainLamp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Lamp");
        MyPanelLamp panel = new MyPanelLamp();
        frame.setContentPane(panel);
        frame.setSize(600,600);
        frame.setVisible(true);
    }
}
