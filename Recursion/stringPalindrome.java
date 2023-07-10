/*
Check whether a given String 'S' is a palindrome using recursion. Return true or false.
Example:
Input: s = "racecar"
Output: true
 */
    public static boolean isPalindrome(String str) {
        // Write your code here.
    	int length = str.length();
    	if(length <= 1) {
    		return true;
    	}
    	if( str.charAt(0) == str.charAt(length-1)  ) {
    		 return isPalindrome(str.substring(1,str.length()-1));
    	}
    	else {
    		return false;
    	}
        
    }
 
	
	 public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    String str = s.nextLine();
	    System.out.println(isPalindrome(str));
	 }
