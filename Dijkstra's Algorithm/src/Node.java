import java.awt.Graphics;
import java.util.ArrayList;

public class Node {

	private int name;
	private ArrayList<Edge> neighbors;

	public Node(int name) {
		this.name = name;
		neighbors = new ArrayList<Edge>();
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
	
}

