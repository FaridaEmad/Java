import javax.swing.*;

public class MainGraphics {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Graphics Environment");
        MyPanelGraphics panel = new MyPanelGraphics();
        frame.setContentPane(panel);
        frame.setSize(600,900);
        frame.setVisible(true);
    }
}
