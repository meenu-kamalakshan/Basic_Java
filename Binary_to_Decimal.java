public class Binary_to_Decimal {
	public static void main(String[] Args){
		double D= 0;
		int B =1000;
		String Bi= "1001";
		int Bilength = Bi.length();
		for(int i =0; i<Bilength;i++){
			int n= B % 10;
			double d= Math.pow(2, i);
			D = D + (n* d);
			System.out.println(D);
			B= B/10;
		System.out.println(Math.round(D));
		}	
	}
}


