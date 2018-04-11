import java.awt.Graphics;

import javax.swing.JPanel;

public class GraphView extends JPanel {
	
	private Graph graph;
	
	public GraphView(Graph g){
		this.graph = g;
	}
	
	@Override
	public void paint(Graphics g) {
		for (Node n : graph.getNodes()) {
			n.draw(g);
		}
	}

}
