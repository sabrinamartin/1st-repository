import java.util.HashSet;
import java.util.Set;

public class SetDifference {
	
	public static Set<Integer> setDifference(Set<Integer> isolated, Set<Integer> other) {
		Set<Integer> difference = new HashSet<Integer>();
		for (int e:isolated) {
			if (other.contains(e) == false) {
				difference.add(e);
			}
		}
		return difference;
	}
	
	public static void main(String[] args) {
		Set<Integer> aS = new HashSet<Integer>();
		int[] aI = {1, 2, 3, 6, 8, 5, 9};
		for (int e:aI) {
			aS.add(e);
		}
		
		Set<Integer> bS = new HashSet<Integer>();
		int[] bI = {1, 4, 3, 0, 8, 7};
		for (int e:bI) {
			bS.add(e);
		}
		
		System.out.println("Set A: " + aS);
		System.out.println("Set B: " + bS);
		
		Set<Integer> ab = setDifference(aS, bS);
		System.out.println("A-B: " + ab);
		
		Set<Integer> ba = setDifference(bS, aS);
		System.out.println("B-A: " + ba);
	}

}
