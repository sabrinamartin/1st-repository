import java.util.ArrayList;

public class Permutations {
	
	public static void permutate(ArrayList<Integer> al, int index) {
		if (al.size() == 1) {
			System.out.println(al);
		} else if (index == al.size()-1) {
			System.out.println(al);
		} else {
			for (int i = index; i < al.size(); i++) {
				int temp = al.get(i);
				al.set(i, al.get(index));
				al.set(index, temp);
				permutate(al, index+1);
				temp = al.get(i);
				al.set(i, al.get(index));
				al.set(index, temp);
			}
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> aL = new ArrayList<Integer>();
		int[] aI = {1, 2, 3, 6, 8, 5, 9};
		for (int e:aI) {
			aL.add(e);
		}
		permutate(aL, 0);
	}

}
