import java.util.HashSet;
import java.util.Set;

public class MathSet extends HashSet<Integer> {
	
	public Set<Integer> a;
	public Set<Integer> b;
	
	public MathSet(Set<Integer> a, Set<Integer> b) {
		this.a = a;
		this.b = b;
	}

	public Set<Integer> setUnion() {
		Set<Integer> union = new HashSet<Integer>();
		for (int e:a) {
			union.add(e);
		}
		for (int e:b) {
			union.add(e);
		}
		return union;
	}
	
	public Set<Integer> setIntersection() {
		Set<Integer> intersection = new HashSet<Integer>();
		for (int e:a) {
			if (b.contains(e)) {
				intersection.add(e);
			}
		}
		return intersection;
	}
	
	public static void main(String[] args) {
		Set<Integer> h1 = new HashSet<Integer>();
		h1.add(1);
		h1.add(2);
		h1.add(5);
		System.out.println("Set 1: " + h1);
		Set<Integer> h2 = new HashSet<Integer>();
		h2.add(3);
		h2.add(4);
		h2.add(5);
		System.out.println("Set 2: " + h2);
		MathSet mathSetObject = new MathSet(h1, h2);
		System.out.println("Union: " + mathSetObject.setUnion());
		System.out.println("Intersection: " + mathSetObject.setIntersection());
	}
	
}
