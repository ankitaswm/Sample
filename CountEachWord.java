import java.util.HashMap;

public class CountEachWord {

	public static void main(String[] args) {
		String str = "This is it and it is bad";
        HashMap<String, Integer> map = new HashMap<>();
        String words[] = str.split(" ");
        int count =0;
        for(String word: words)
        {
        	if(map.containsKey(word))
        	{
        	    count = map.get(word);
        		map.put(word, ++count);
        		}
        	else {
        		map.put(word, 1);
        	}
        }
        System.out.println(map);
	}

}
