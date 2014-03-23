import java.util.Scanner;

class Basic_Addition{
	public static void main(String args[]){
		Scanner inp = new Scanner(System.in);
		double fnum, snum, ans;
		System.out.println("Enter First num:");
		fnum = inp.nextDouble();
		System.out.println("Enter second num:");
		snum = inp.nextDouble();
		ans = fnum+snum;
		System.out.println(ans);
		inp.close();	
	}
}