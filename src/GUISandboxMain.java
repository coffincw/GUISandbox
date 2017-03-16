/**
 * Created by caleb on 3/16/17.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUISandboxMain implements ActionListener{
    static JFrame mainFrame;
    static JPanel mainPanel;
    static JTextField textField1;
    static JButton button1;

    public GUISandboxMain() {
        mainFrame = new JFrame();
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(500, 400);

        mainFrame.setVisible(true);

        mainPanel = new JPanel();
        mainFrame.setContentPane(mainPanel);

        mainPanel.setBackground(Color.PINK);
        mainPanel.add(new JLabel ("Hi! I'm a label!"));

        textField1 = new JTextField(20);
        Font font1 = new Font("SansSerif", Font.BOLD, 12);
        textField1.setFont(font1);
        mainPanel.add(textField1);

        button1 = new JButton("Go!");
        mainPanel.add(button1);
        button1.addActionListener(this);

        mainFrame.pack();
    }

    public void actionPerformed (ActionEvent e) {
        if (e.getSource() == button1) {
            System.out.println(textField1.getText());
        }
    }

    public static void main(String [] args) {
        GUISandboxMain mainWindow = new GUISandboxMain();
    }
}
