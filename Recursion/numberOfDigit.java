
/*
 You have been given a number 'n'. Return the number of digits present in 'n' .
Input Format :
Integer n
Output Format :
Count of digits
Sample Input 1 :
 156
Sample Output 1 :
3
Sample Input 2 :
 7
Sample Output 2 :
1
 */
public class numberOfDigit {
	public static int count(int n){
		if(n==0) {
			return 0;
		}
		
		int initialOutput = count(n/10);
		int value = initialOutput + 1;
		return value;
	}
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(count(n));
	}
}
