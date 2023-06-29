import java.util.Scanner;

public class printNaturalNumber {
	
	public static void printnumber(int n) {
		
		if(n==0) {
			return;
		}
		printnumber(n-1);
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		printnumber(n);
	}
}
