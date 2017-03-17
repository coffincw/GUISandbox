/**
 * Created by caleb on 3/16/17.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUISandboxMain implements ActionListener{
    static JFrame mainFrame;
    static SandboxPanel mainPanel;
    static JTextField textField1;
    static JButton button1;
    static JTextField textField2;

    public GUISandboxMain() {
        mainFrame = new JFrame();
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(500, 400);

        mainFrame.setVisible(true);

        mainPanel = new SandboxPanel();
        mainFrame.setContentPane(mainPanel);

        mainPanel.setBackground(Color.PINK);
        mainPanel.add(new JLabel ("Hi! I'm a label!"));

        textField1 = new JTextField(20);
        Font font1 = new Font("SansSerif", Font.BOLD, 12);
        textField1.setFont(font1);
        mainPanel.add(textField1);

        textField2 = new JTextField(20);
        textField2.setEditable(false);
        mainPanel.add(textField2);

        button1 = new JButton("Go!");
        mainPanel.add(button1);
        button1.addActionListener(this);

        // mainFrame.invalidate();
        mainFrame.pack();
    }

    public void actionPerformed (ActionEvent e) {
        if (e.getSource() == button1) {
            System.out.println(textField1.getText());
            textField2.setText(textField1.getText());
        }
    }

    public static void main(String [] args) {
        GUISandboxMain mainWindow = new GUISandboxMain();
    }
}
