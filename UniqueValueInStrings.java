import java.util.*;
import java.util.Arrays;

public class UniqueValueInStrings {

	public static void main(String[] args) {
		String[] arr1 = new String[]{"Apple","Boy","cat","Dog"};
		String[] arr2 = new String[]{"Ele","cat","Boy","Fish"};
		
		List<String> list = new ArrayList<String>(Arrays.asList(arr1));
		list.addAll(Arrays.asList(arr2));
		System.out.println(list);
		Set<String> values = new HashSet<String>();
		
		for(String word : list)
		{
			values.add(word);
		}
		System.out.println(values);
		String[] newArr = new String[values.size()];
		values.toArray(newArr);
		System.out.println(Arrays.toString(newArr));

	}

}
