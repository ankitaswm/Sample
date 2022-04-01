
public class RemoveSpecialChar {

	public static void main(String[] args) {
		String str = "Testing@#123";
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);

	}

}
