/*
Given a string S, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".
Input format : String S
Output format : Modified string
Sample Input 1 : hello
Sample Output 1: hel*lo
*/
	
	public static String addStars(String s) {
        // Write your code here
        if(s.length()==1)
            return s;
        String smallans=addStars(s.substring(1));
        if(s.charAt(0)==smallans.charAt(0))
            return s.charAt(0)+"*"+smallans;
        else
            return s.charAt(0)+smallans;
    }
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(addStars(input));
	}
