/**
 * Created by caleb on 3/17/17.
 */
import javax.swing.*;
import java.awt.*;

public class SandboxPanel extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawString("HELLO WORLD", 10, 150);

        g.setColor(Color.WHITE);

        g.fillOval(200, 200, 100, 100);
    }
    public void erase() {
        getGraphics().clearRect(0, 0, getWidth(), getHeight() );
    }

    public void drawRandomCircle() {
        int width = getWidth();
        int height = getHeight();
        int x = (int) (Math.random() * width);
        int y = (int) (Math.random() * height);
        int radius = (int) (Math.random() * (width - x));
        Graphics g = getGraphics();

        g.setColor(new Color((int) (Math.random() * 256),
                (int) (Math.random() * 256),
                (int) (Math.random() * 256)));
        g.fillOval(x, y, radius, radius);

    }
}
