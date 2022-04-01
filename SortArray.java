import java.util.ArrayList;
import java.util.Collections;

public class SortArray {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(5);
		arr.add(2);
		arr.add(10);
		arr.add(7);
		arr.add(1);
		Collections.sort(arr);
		System.out.println(arr);
		Collections.sort(arr,Collections.reverseOrder());
		System.out.println(arr);
               
	}

}
