import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
            JLabel label = new JLabel();
            label.setText("Hola putos");
            label.setHorizontalAlignment(JLabel.CENTER);
            label.setVerticalAlignment(JLabel.BOTTOM);

            JPanel bluepanel = new JPanel();
            bluepanel.setBackground(Color.CYAN);
            bluepanel.setBounds(0,0,250,250);

            JPanel redpanel = new JPanel();
            redpanel.setBackground(Color.RED);
            redpanel.setBounds(250,0,250,250);

            JPanel greenpanel = new JPanel();
            greenpanel.setBackground(Color.GREEN);
            greenpanel.setBounds(0,250,500,250);
            greenpanel.setLayout(new BorderLayout());

            JFrame frame = new JFrame("Test");
            frame.add(bluepanel);
            frame.add(greenpanel);
            greenpanel.add(label);
            frame.add(redpanel);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(null);
            frame.setSize(750,750);
            frame.setVisible(true);

    }
}