import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Graph {
	
	private ArrayList<Node> nodes;
	public int[] distance;
	public Node[] previous;
	
	public ArrayList<Node> getNodes() {
		return nodes;
	}
	
  /**
  * Sample adjListRep: {{}, {{2,7},{3,9},{6,14}}, {{1,7},{3,10},{4,15}}, {{1,9},{2,10},{4,11},{6,2}}, {{5,6},{3,11},{2,15}}, {{4,6},{6,9}}, {{5,9},{3,2},{1,14}}};
  */
	public Graph(ArrayList<ArrayList<ArrayList<Integer>>> adjListRep) {
    //1. Create a node for each element in adjListRep
    //--make Node arraylist
    //--make as many nodes as there are items in adjListRep
    nodes = new ArrayList<Node>();
    for (int k = 0; k < adjListRep.size(); k++) {
      nodes.add(new Node(k));
		}
    //2. For each adjList in adjListRep:
    			//for each Edge in adjList --> nodes.get(i).addNeighbor(neighbor, distance);
		for (int j = 0; j < adjListRep.size(); j++) {
			for (ArrayList<Integer> pair : adjListRep.get(j)) {
				nodes.get(j).addNeighbor(nodes.get(pair.get(0)), pair.get(1));
			}
		}
	}
	
	public Node getNode(int name){
		return nodes.get(name);
	}
  
//  public String toString(){
//    String res = "";
//    for (Node n : nodes){
//      res += n;
//      res += "\n--------------------\n";
//    }
//    return res;
//  }
  
  /**
   * Finds the shortest path to every node
   * https://en.wikipedia.org/wiki/Dijkstra%27s_algorithm#Pseudocode
   * @param source The name of the starting node
   */
  public void Dijkstra(int source) {
	  distance = new int[nodes.size()];
	  for (int i = 0; i < distance.length; i++){
		  if (i == source) {
			  distance[i] = 0;
		  } else {
			  distance[i] = Integer.MAX_VALUE; //unknown distance between the source and given node, 
			  								   //set to infinity
		  }
	  }
	  previous = new Node[nodes.size()];
	  PriorityQueue<Node> q = new PriorityQueue<Node>(nodes.size(), new Comparator<Node>(){ 
		  //create PriorityQueue (same size as nodes) and makes new Comparator 
		  //class to compare the nodes' distance to the source

		@Override
		public int compare(Node n1, Node n2) {
			if (distance[n1.getName()] > distance[n2.getName()]) {
				return 1;
			} else if (distance[n1.getName()] < distance[n2.getName()]) {
				return -1;
			} else {
				return 0;
			}
		}
		  
	  });
	  //add all nodes to priority queue
	  for (Node n:nodes) {
		  q.add(n);
	  }
	  while (q.size() > 0) {
		  Node u = q.poll(); //removing top of queue, always pulling next closest node to source
		  					 //will never find longer path to node
		  for (Edge e: u.getNeighbors()) { //e is still in q
			  int alt = distance[u.getName()] + e.distance;
			  if (alt < distance[e.destination.getName()]) { //a shorter path to e has been found
				  distance[e.destination.getName()] = alt;
				  previous[e.destination.getName()] = u; 
				  q.remove(e.destination); //re-prioritize, maintain correct order
				  q.add(e.destination);

			  }
			 
		  }
	  }
	  
  }
  
}