import java.awt.*;
import javax.swing.JFrame;

public class CowFrame extends JFrame {
	private final Color BISQUE = new Color(0xcdb79e);
	
	public CowFrame () {
		init();
	}
	
	public void init() {
		setSize(700,600);
		setBackground(Color.WHITE);
		repaint();
	}
	
	public void paint(Graphics g) {
		g.setColor(BISQUE);
		g.fillRect(50, 100, 400, 200);
		g.setColor(Color.BLACK);
		g.drawOval(350, 50, 200, 100);
		g.fillOval(500, 75, 20, 20);
		g.fillOval(450, 75, 20, 20);
		g.setColor(BISQUE);
		g.fillRect(50, 300, 50, 150);
		g.fillRect(150, 300, 50, 150);
		g.fillRect(300, 300, 50, 150);
		g.fillRect(400, 300, 50, 150);
	}
}
