import java.util.HashMap;
import java.util.Iterator;
import java.util.*;

public class SortHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(10, "Apple");
		map.put(2, "Boy");
		map.put(7, "Cat");
		map.put(5, "Ele");
	
		// First way to sort hashmap
		List<Integer> list = new ArrayList<>(map.keySet());
		Collections.sort(list);
		System.out.println(list);
		HashMap<Integer, String> newMap = new HashMap<>();
		for(int i=0;i<list.size();i++)
		{
			newMap.put(list.get(i), map.get(list.get(i)));
		}
		System.out.println(newMap);
		
		//Second way to do
		TreeMap<Integer, String> sortedMap = new TreeMap<>();
		sortedMap.putAll(map);
		
		System.out.println(sortedMap);
	}

}
