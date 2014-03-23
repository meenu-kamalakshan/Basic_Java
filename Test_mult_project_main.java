import java.util.Scanner;

class Test_mult_project_main{
	public static void main (String[] args){
		/* simple message in tuna class .*/
		Scanner inp = new Scanner(System.in);
		test_mult_class test_mult_classObject = new test_mult_class();
		
		System.out.println("Enter your name here");
		String name = inp.nextLine();
		inp.close();
		test_mult_classObject.simpleMessage(name);
		
	}
}