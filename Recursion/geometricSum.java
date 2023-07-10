import java.text.DecimalFormat;
import java.util.Scanner;
/*
Geometric Sum
Given k, find the geometric sum i.e.1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k) using recursion.
Input format :Integer k
Output format :Geometric sum (upto 5 decimal places)
 */
public static double findGeometricSum(int k){
		// Write your code here
		if(k == 0){
			return 1;
		}

		double smallOutput = findGeometricSum(k-1);
		double ans = smallOutput+ (1/(Math.pow(2, k)));
		return ans;
		
		
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		double ans = findGeometricSum(k);
		
		DecimalFormat dec = new DecimalFormat("#0.00000");
		System.out.println(dec.format(ans));
	}
