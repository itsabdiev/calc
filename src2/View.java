import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Objects;

public class View {
    private char theme = '0';
    private JToggleButton switchButton;
    private Controller controller;
    private Color color = Color.BLACK;
    private JPanel panel;
    public View() throws IOException {
        controller = new Controller(this);
        switchButton = new JToggleButton(getIcon());
        switchButton.setBounds(0,0,30,30);
        switchButton.addActionListener(controller);
        switchButton.setActionCommand("toggle");
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.BLACK);
        panel.add(switchButton);
        panel.setBounds(0, 0, 400, 420);
        JFrame frame = new JFrame("");
        frame.setSize(400, 420);
        frame.setLocation(1000, 50);
        frame.setLayout(null);
        frame.add(panel);
        frame.setResizable(false);
        frame.setVisible(true);
    }



    private Icon getIcon() throws IOException{
        if (theme == '0' || theme == '1') {
            theme = '2';
            return new ImageIcon(ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("1.png"))));
        }
        theme = '1';
        return new ImageIcon(ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("2.png"))));
    }


    public void setTheme() throws IOException {
        switchButton.setIcon(getIcon());
        if (color.equals(Color.BLACK)) {
            color = Color.WHITE;
            panel.setBackground(color);
        }else {
            color = Color.BLACK;
            panel.setBackground(color);
        }
    }
}
