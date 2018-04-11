import java.awt.Graphics;
import java.util.ArrayList;

public class Node {

	private int name;
	private ArrayList<Edge> neighbors;
	private int x, y;

	public Node(int name) {
		this.name = name;
		neighbors = new ArrayList<Edge>();
		if (x == 0) x = (int) (Math.random()*500); //rand num between 0 and 500
		if (y == 0) y = (int) (Math.random()*500);
	}

	//taking 2 nodes and connecting them, 1-way connection
	public void addNeighbor(Node neighbor, int distance){
		neighbors.add(new Edge(distance, neighbor));
	}

	public ArrayList<Edge> getNeighbors() {
		return neighbors;
	}

	public int getName() {
		return name;
	}

	@Override
	public String toString(){
		String res = "";
		for (Edge neighbor : neighbors){
			res += name + "->" + neighbor + "\n";
		}
		return res;
	}
	
	public void draw(Graphics g) {
		g.drawOval(x, y, 50, 50); //radius 50, center: x+25, y+25
		g.drawString(""+name, x+20, y+30);
		
		for (Edge neighbor: neighbors) {
			double x1 = x + 25;
			double y1 = y + 25;
			double x2 = neighbor.destination.x+25;
			double y2 = neighbor.destination.y+25;
			double length = Math.hypot(x1-x2, y1-y2);
			double startX = 25.0 *(x2-x1)/length;
			double startY = 25.0 *(y2-y1)/length;
			double endX = (length - 50)*(x2-x1)/length;
			double endY = (length - 50)*(y2-y1)/length;

			g.drawLine((int) startX + x + 25, (int) startY + y + 25, (int) endX + x +25, (int) endY + y + 25);
			
			
		}
	}

}

