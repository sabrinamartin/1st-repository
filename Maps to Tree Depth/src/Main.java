import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

// I read Java Functional Mapping on Coding Bat to figure this out
public class Main {
	
	public static void main (String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 43, 5, 56, 7,5));
		System.out.println(l);
		System.out.println(mapcar(l , n -> n*2));
	}
	
	public static List<Integer> mapcar(List<Integer> l, Function<Integer, Integer> f) {
		return l.stream().map(f).collect(Collectors.toList());
	}

}


