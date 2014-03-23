public class Balanced_paranthesis {
	public static void main (String[] args){
		String aString = "((())))()())";
		if (aString.length() % 2 !=0){
			System.out.println("Not Balanced");
		}
		aString = aString.replaceAll("()","");
		while (aString.length()!=0){
			aString= aString.replaceAll("()","");
			System.out.println(aString);
			}
	}
	
}