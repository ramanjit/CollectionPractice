package ArrayList;
import java.util.ArrayList;
import java.util.Iterator;

public class forEachRemaning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add("Raman");
		list.add("DFSS");
		Iterator<String> itr = list.iterator();
		itr.forEachRemaining(a -> {
			System.out.println(a);
		});
	}

}
