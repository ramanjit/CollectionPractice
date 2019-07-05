package ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class ByListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String>  list = new ArrayList<String>();
		list.add("raman");
		list.add("Kaur");
		list.add("Manjit");
		
		ListIterator<String> itr = list.listIterator(list.size());
		while(itr.hasPrevious())
		{
			String str = itr.previous();
			System.out.println(str);
		}
		
	
	}

}
