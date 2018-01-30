import java.util.*; 

class TreeSetCollection { 
	
	public static void main(String args[]){  
		TreeSet<String> books = new TreeSet<String>();  
		books.add("To Kill a Mockingbird");  
		books.add("Roll of Thunder Hear My Cry");  
		books.add("The Witches");  
		books.add("The Giver"); 
		books.add("My Name is Malala");
		Iterator<String> itr=books.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
	}  
	
}  
