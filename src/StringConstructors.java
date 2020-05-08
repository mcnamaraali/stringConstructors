
public class StringConstructors {

	public static void main(String[] args) {
		char[] charArray = {'h', 'e', 'l', 'l','o', ' ', 'W', 'o', 'r', 'l', 'd'};
		String string = new String ("another hello world");
		
		//use of string constructors
		String string1 = new String();
		String string2 = new String(string);
		String string3 = new String(charArray);
		String string4 = new String(charArray, 6, 5);
		String string5 = new String(charArray, 3, 3);

		System.out.printf("string = %s%n", string);
		System.out.printf("string1 = %s%n", string1);
		System.out.printf("string2 = %s%n", string2);
		System.out.printf("string3 = %s%n", string3);
		System.out.printf("string4 = %s%n", string4);
		System.out.printf("string5 = %s%n", string5);
	}

}
