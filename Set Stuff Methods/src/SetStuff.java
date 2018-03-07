import java.util.ArrayList;
import java.util.Arrays;

public class SetStuff {
	
	public static ArrayList<Integer> ret17() {
		  ArrayList<Integer> retval = new ArrayList<Integer>();
		  retval.add(17);
		  return retval;
	}
	
	public static Integer zerothElement(ArrayList<Integer> al){
		  return al.get(0);
	}
	
	public static boolean contains(int a, int[] ar){
		  boolean retval = false;
		  for (int i = 0; i<ar.length; i++) {
		    if (ar[i] == a) {
		      retval = true;
		    }
		  }
		  return retval;
	}
	
	public static int[] intersect(int[] a, int[] b){
		  int size = 0;
		  for (int i = 0; i < a.length; i++) {
		    for (int j = 0; j < b.length; j++) {
		      if (a[i] == b[j]) {
		        size += 1;
		      }
		    }
		  }
		  int[] retval = new int[size];
		  int index = 0;
		  for (int e = 0; e < a.length; e++) {
		    for (int k = 0; k < b.length; k++) {
		      boolean have_element = false;
		      if (a[e] == b[k]) {
		        for (int m = 0; m < index; m++) {
		          if (retval[m] == a[e]) {
		            have_element = true;
		          }
		        }
		        if (have_element == false) {
		          retval[index] = a[e];
		          index += 1;
		        } 
		      }
		    }
		  }
		  return retval;
	}
	
	public static boolean anyContains(int[] a, int[] b){
		  for (int i = 0; i < a.length; i++) {
		    for (int j = 0; j < b.length; j++) {
		      if (a[i] == b[j]) {
		        return true;
		      }
		    }
		  }
		  return false;
	}
	
	public static int[] union(int[] a, int[] b){
		  int length = a.length + b.length;
		  int [] retval = new int[length];
		  int index = 0;
		  for (int i = index; i < a.length; i++) {
		    retval[i] = a[i];
		    index += 1;
		  }
		  for (int j = 0; j<b.length; j++) {
		    retval[index] = b[j];
		    index += 1;
		  }
		  return retval;
	}
	
	public static String nearestUnvisitedNode(boolean[] visited, int[] distance, String[] nodeName){
		  //counts number of falses
		  int num_false = 0;
		  for (int i = 0; i < visited.length; i++) {
		    if (visited[i] == false) {
		      num_false += 1;
		    }
		  }
		  
		  //creates a new array with length equal to num of falses, 
		  if (num_false > 0) {
		    int[] nums_false = new int[num_false];
		    int index = 0;
		    for (int j = 0; j < visited.length; j++) {
		      if (visited[j] == false) {
		        nums_false[index++] = distance[j];
		      }
		    }
		    int min = nums_false[0];
		    for (int k = 0; k < nums_false.length; k++) {
		      if (nums_false[k] < min) {
		        min = nums_false[k];
		      }
		    }
		    int retval_index = 0;
		    for (int e = 0; e < distance.length; e++) {
		      if (distance[e] == min) {
		        retval_index = e;
		      }
		    }
		    return nodeName[retval_index];
		  } else {
		    return "";
		  }
	}
	
	public static ArrayList<Integer> listify(int a, int b, int c){
		  ArrayList<Integer> retval = new ArrayList<Integer>();
		  retval.add(a);
		  retval.add(b);
		  retval.add(c);
		  return retval;
	}
	
	public static ArrayList<ArrayList<Object>> addEdge(ArrayList<ArrayList<Object>> graph, int a, int b, int c){
		  ArrayList<Object> addOn = new ArrayList<Object>();
		  addOn.add(a);
		  addOn.add(b);
		  addOn.add(c);
		  graph.add(addOn);
		  return graph;
	}
	
	public static ArrayList<Integer> collectNodes(ArrayList<ArrayList<Integer>> edgelist){
		  ArrayList<Integer> retval = new ArrayList<Integer>();
		  for (int i = 0; i < edgelist.size(); i++){
		    for (int k = 0; k < 2; k++) {
		      if (retval.contains(edgelist.get(i).get(k)) == false) {
		        retval.add(edgelist.get(i).get(k));
		      }
		    }
		  }
		  return retval;
	}
	
	public static ArrayList<Integer> setInfinity(int n, int start){
		  ArrayList<Integer> retval = new ArrayList<Integer>();
		  for (int i = 0; i < n; i++) {
		    if (i == start) {
		      retval.add(0);
		    } else {
		      retval.add(Integer.MAX_VALUE);
		    }
		  }
		  return retval;
	}


	
	public static void main (String[] args) {
		//Method #1
		System.out.println("Method #1: ret17()");
		System.out.println("   ret17() --> " + ret17() + "\n");
		
		//Method #2
		System.out.println("Method #2: zerothElement()");
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(3);
		al.add(4);
		al.add(9);
		System.out.println("   zerothElement([3, 4, 9]) --> " + zerothElement(al) + "\n");
		
		//Method #3
		System.out.println("Method #3: contains()");
		int[] arr = {3, 4, 9};
		int n = 3;
		System.out.println("   contains(3, [3, 4, 9]) --> " + contains(n, arr) + "\n");
		
		//Method #4
		System.out.println("Method #4: anyContains()");
		int[] a = {3, 5, 9, 10};
		int[] b = {2, 4, 9, 10};
		System.out.println("   anyContains([3, 5, 9, 10], [2, 4, 10, 9]) --> " + anyContains(a, b) + "\n");
		
		//Method #5
		System.out.println("Method #5: union()");
		System.out.println("   union([3, 5, 9, 10], [2, 4, 10, 9]) --> " + Arrays.toString(union(a, b)) + "\n");
		
		//Method #6
		System.out.println("Method #6: intersect()");
		System.out.println("   intersect([3, 5, 9, 10], [2, 4, 10, 9]) --> " + Arrays.toString(intersect(a, b)) + "\n");
		
		//Method #7
		System.out.println("Method #7: nearestUnvisitedNode()");
		boolean[] bools = {false, false, true};
		int[] nums = {1, 2, 3};
		String[] str = {"AB", "BB", "C"};
		System.out.println("   nearestUnvisitedNode([false, false, true], [1, 2, 3], ['Ab', 'BB', 'C']) --> " + nearestUnvisitedNode(bools, nums, str) + "\n");
		
		//Method #8
		System.out.println("Method #8: listify()");
		System.out.println("   listify(3, 4, 9) --> " + listify(3, 4, 9) + "\n");
		
		//Method #9
		System.out.println("Method #9: addEdge()");
		ArrayList<ArrayList<Object>> outer = new ArrayList<ArrayList<Object>>();
		ArrayList<Object> inner = new ArrayList<Object>();
		inner.add(2);
		inner.add(3);
		inner.add(5);
		outer.add(inner);
		System.out.println("   addEdge([2, 3, 5], 4, 9, 3) --> " + addEdge(outer, 4, 9, 3) + "\n");
		
		//Method #10
		System.out.println("Method #10: collectNodes()");
		ArrayList<Integer> d = new ArrayList<Integer>();
		d.add(1);
		d.add(2);
		d.add(3);
		ArrayList<Integer> e = new ArrayList<Integer>();		
		e.add(4);
		e.add(5);
		e.add(6);
		ArrayList<ArrayList<Integer>> edgeList = new ArrayList<ArrayList<Integer>>();
		edgeList.add(d);
		edgeList.add(e);
		System.out.println("   collectNodes([1, 2, 3], [4, 5, 6]) --> " + collectNodes(edgeList) + "\n");
		
		//Method #11
		System.out.println("Method #11: setInfinity()");
		System.out.println("   setInfinity(3, 1) --> " + setInfinity(3, 1) + "\n");
	}

}
