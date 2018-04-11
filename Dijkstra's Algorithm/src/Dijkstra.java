import java.util.ArrayList;
import javax.swing.*;
import java.util.Arrays;

public class Dijkstra {

	public static void main (String[] args) { //convert from Integer[][][] to 3x ArrayList<Integer>
		ArrayList<ArrayList<ArrayList<Integer>>> lists = new ArrayList<ArrayList<ArrayList<Integer>>>();
		Integer[][][] list = new Integer[][][] {{}, {{2,7},{3,9},{6,14}}, {{1,7},{3,10},{4,15}}, 
												{{1,9},{2,10},{4,11},{6,2}},{{5,6},{3,11},{2,15}}, 
												{{4,6},{6,9}}, {{5,9},{3,2},{1,14}}};
												//Edge{}-->Node{{}}-->Graph{{{}}}
		for(Integer [][] adj : list) {
			ArrayList<ArrayList<Integer>> nodeData = new ArrayList<ArrayList<Integer>>();
			for(Integer[] pair : adj) {
				ArrayList<Integer> pairList = new ArrayList<Integer>();
				for(Integer i : pair) {
					pairList.add(i);
				}
				nodeData.add(pairList);
			}
			lists.add(nodeData);
		}
		Graph ex = new Graph(lists);
		System.out.println(ex);
		
		ex.Dijkstra(1);
		System.out.println(Arrays.toString(ex.distance));
	
	}

}


