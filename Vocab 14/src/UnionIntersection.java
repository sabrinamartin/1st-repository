import java.util.Set;
import java.util.HashSet;


public class UnionIntersection {
	
	public static Set<Integer> setUnion(Set<Integer> a, Set<Integer> b) {
		Set<Integer> union = new HashSet<Integer>();
		for (int e:a) {
			union.add(e);
		}
		for (int e:b) {
			union.add(e);
		}
		return union;
	}
	
	public static Set<Integer> setIntersection(Set<Integer> a, Set<Integer> b) {
		Set<Integer> intersection = new HashSet<Integer>();
		for (int e:a) {
			if (b.contains(e)) {
				intersection.add(e);
			}
		}
		return intersection;
	}
	
	public static void main (String[] args) {
		Set<Integer> s1 = new HashSet<Integer>();
		int[] a1 = {1, 2, 3, 6, 8};
		for (int e:a1) {
			s1.add(e);
		}
		Set<Integer> s2 = new HashSet<Integer>();
		int[] a2 = {1, 4, 3, 6, 7};
		for (int e:a2) {
			s2.add(e);
		}
		System.out.println("Set A = " + s1);
		System.out.println("Set B = " + s2);
		System.out.println("Union = " + setUnion(s1, s2));
		System.out.println("Intersection = " + setIntersection(s1, s2));
	}

}
