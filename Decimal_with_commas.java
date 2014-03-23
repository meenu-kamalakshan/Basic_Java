public class Decimal_with_commas {
	public static void main(String[] args){
		int input = 1234567890;
		String output ="";
		int temporary = input %1000;
		output = String.valueOf(temporary) + output;
		input=input/1000;
		while(input > 999){
			int temp = input %1000;
			output = String.valueOf(temp) + ","+ output;
			input = input/1000;
		}
		output = String.valueOf(input) + ","+ output;
		System.out.println(output);
	}
}
