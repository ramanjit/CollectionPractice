package ArrayList;
import java.util.ArrayList;

public class ByForEachMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("ABC");
		list.add("BCD");
		list.add("DEF");
		list.add("EFG");
		
		System.out.println("Traversing list throgh forEach() method");
		
		list.forEach( a ->{
			System.out.println(a);
			
		});
		
		
		
	}

}
