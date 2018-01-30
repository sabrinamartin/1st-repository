import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map;

public class TreeMapExample {
	
	public static void main(String args[]) {

	      TreeMap<Integer, String> fav_foods = new TreeMap<Integer, String>();

	      /*Adding elements to TreeMap*/
	      fav_foods.put(1, "Pho");
	      fav_foods.put(2, "Bell Peppers");
	      fav_foods.put(7, "Cake");
	      fav_foods.put(3, "Roasted Chicken");
	      fav_foods.put(4, "Cherries");

	      /* Display content using Iterator*/
	      Set set = fav_foods.entrySet();
	      Iterator iterator = set.iterator();
	      while(iterator.hasNext()) {
	         Map.Entry mentry = (Map.Entry)iterator.next();
	         System.out.print("Ranking is: "+ mentry.getKey() + " & food is: ");
	         System.out.println(mentry.getValue());
	      }

	   }
	

}
