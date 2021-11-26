Stack<Character> s1 = new Stack<Character>();
	Scanner input = new Scanner(System.in);
	
System.out.println("Enter value in string : ");
String words = input.nextLine();
		
for(int i = 0 ; i<words.length() ; i++)
{
	char a = words.charAt(i);
	s1.push(a);
}
String new_word = "";
for(int loop = 0; loop<words.length() ; loop++)
{
new_word += s1.pop();
}
System.out.println("Reverse : "+new_word);