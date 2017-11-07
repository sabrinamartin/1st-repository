
public class pascals_triangle {
	
	public static void main (String[] args){
		System.out.println(pascal(-1, -2));
		System.out.println(pascal(1, 2));
		System.out.println(pascal(0, 0));
		System.out.println(pascal(30, 19));
	}
	
	public static int pascal(int row, int col) {
		if (row < 0 && col < 0) {
			return 0;
		} else if (row < col) {
			return 0;
		} else if (row == 0 & col == 0) {
			return 1;
		} else {
			return pascal(row-1, col-1) + pascal(row-1, col);
		}
	}

}
