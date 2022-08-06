import java.util.Scanner;
public class RemoveConsequtiveDuplicates {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		System.out.println(RemoveConsDup(str));
	}
	
	public static String RemoveConsDup(String str) {
		if(str.length()<=1) {
			return str;
		}
		
		String subStr = RemoveConsDup(str.substring(1));
		if(str.charAt(0)==subStr.charAt(0)) {
			return subStr;
		}
		else {
			return str.charAt(0) + subStr;
		}
	}
}
