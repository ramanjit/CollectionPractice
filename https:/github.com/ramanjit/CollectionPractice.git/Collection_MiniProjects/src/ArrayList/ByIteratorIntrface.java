package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
public class ByIteratorIntrface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<String>();
		list.add("Raman");
		list.add("Kaur");
		list.add("Manjit");
		list.add("Sarbjit");
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println("Elements are : " +itr.next());
		}
		
	}

}
