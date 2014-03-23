
public class else_if {
	public static void main(String[] args){
		int age = 60;
		
		if (age >= 70){
			System.out.println("You are senior citizen");
		}else if (age >= 60 ){
			System.out.println("You are  in 60's");
		}else if(age >= 50){
			System.out.println("You are  in 50's");
		}else if(age >= 40){
			System.out.println("You are  in 40's");
		}else {
			System.out.println("You are  in Young");
		}
	}
}
