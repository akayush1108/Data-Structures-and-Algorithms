import java.util.Scanner;

public class PrintStairPathsCount {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		System.out.println(printPathsCount(n));
	}
	
	public static int printPathsCount(int n) {
		if(n==0) {
			return 1;
		}
		if(n<0) {
			return 0;
		}
		
		int nm1=printPathsCount(n-1);
		int nm2=printPathsCount(n-2);
		int nm3=printPathsCount(n-3);
		int cp = nm1 + nm2 + nm3;
		
		return cp;
	}
}
