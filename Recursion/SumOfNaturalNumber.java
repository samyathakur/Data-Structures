import java.util.Scanner;

public class sumOfNaturalNumber {
	
	public static int sumOfNumber(int num) {
		
		if(num == 0) {
			return 0 ;
		}
		
		int initialValue = sumOfNumber(num-1);
		int value = num + initialValue;
		
		return value;
	}
	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		int number = s.nextInt();
		System.out.print(sumOfNumber(number));
	}
}
