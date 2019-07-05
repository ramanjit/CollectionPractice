package ArrayList;

import java.util.ArrayList;

public class ByForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> itr = new ArrayList<String>();
		itr.add("Ramanjit");
		itr.add("Sandeep");
		itr.add("Rajath");
		for(int i = 0; i<itr.size(); i++)
		{
			System.out.println("Names : " + itr.get(i));
		}
	}

}
