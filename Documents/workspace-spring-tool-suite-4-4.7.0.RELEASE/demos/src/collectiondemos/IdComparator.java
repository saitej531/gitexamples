package collectiondemos;
import java.util.Comparator;
public class IdComparator implements Comparator<Integer> {

	public int compare(Integer o1, Integer o2) {
		int compared=o2-o1;
		return compared;
	}



	

}
