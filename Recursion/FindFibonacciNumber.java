public class fibonaciNumber {
	public static int fib(int n){
        if(n==1||n==2){
            return 1;
        }
	/***
	2nd method
	if(n<2){
	return n;
	}
	***/
        int fib_n_1=fib(n-1);
        int fib_n_2=fib(n-2);
        int output=fib_n_1+fib_n_2;
        return output;
    }
    public static void main(String[] args){
    	Scanner s = new Scanner(System.in);
		int n = s.nextInt();
        System.out.println(fib(n));
    }
}
