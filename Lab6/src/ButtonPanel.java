import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPanel extends JPanel {
    private int x;
    private JButton inc;
    private JButton dec;

    public ButtonPanel() {
        inc = new JButton("Increment");
        inc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x++;
                repaint();
            }
        });
        add(inc);
        dec = new JButton("Decrement");
        dec.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x--;
                repaint();
            }
        });
        add(dec);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("The Counter : "+x,150,200);
    }
}
