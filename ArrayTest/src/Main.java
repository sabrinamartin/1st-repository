
public class Main {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int  a[] = {1,2,3,4,5,6,7,8,9,10};
			int b = 1;
			mayModify(b);
			mayModifyArray(a); 
	                System.out.print(b);
	                System.out.print(" ");
			System.out.println(a[0]);


		}

		private static void mayModify(int b){
			b = 4;
		}

		private static void mayModifyArray(int[] a){
			a[0]= 4;

		}

	
}
