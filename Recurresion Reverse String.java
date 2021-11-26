package Lab_3;

public class Main_Page {

	public static void main(String[] args) {
		
		String word = "abcdefghi";

		System.out.println("Reverse order is : "+reverse_order(word));
}

	
	public static String reverse_order(String word){
	
		if(word.isEmpty())
		{
			return word;
		}
		return reverse_order(word.substring(1))+word.charAt(0);
	}
}
