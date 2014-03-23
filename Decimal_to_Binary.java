public class Decimal_to_Binary {
		public static void main(String[] args){	
			int N = 5001;
			String S = "";
			
			while(N/2 != 0){
				int s = N%2;
				S = String.valueOf(s) + S;
				N = N/2;

			}
			int s = N%2;
			S = String.valueOf(s) + S;
			System.out.println(S);
			//Integer binary_conv = Integer.parseInt(S);
			//System.out.println(binary_conv);
	}
	}
	
