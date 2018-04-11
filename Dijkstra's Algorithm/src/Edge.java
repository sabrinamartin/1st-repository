public class Edge {
	
  public int distance;
  public Node destination;
	
  public Edge(int distance, Node destination) {
    this.distance = distance;
    this.destination = destination;
  } 
  
  @Override
  public String toString(){
    return destination.getName() + ": " + distance;
  }

}