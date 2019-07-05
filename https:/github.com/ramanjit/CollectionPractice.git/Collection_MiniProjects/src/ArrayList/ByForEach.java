package ArrayList;

import java.util.ArrayList;

public class ByForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> itr = new ArrayList<>();
		itr.add("Raman");
		itr.add("Kaur");
		itr.add("Manjit");
		itr.add("Singh");
		
		for(String itr1 : itr)
		{
			System.out.println("Names : " + itr1);
		}
	}

}
