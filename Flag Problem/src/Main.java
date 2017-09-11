import javax.swing.JFrame;

public class Main {
	
	public static void main (String[] args) {
		JFrame app = new JFrame("USA Flag");
		app.setSize(800, 400);
		app.add(new Flag());
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
	}

}
