/*
 Write a recursive function to convert a given string into the number it represents. That is input will be a numeric string that contains only numbers, you need to convert the string into corresponding integer and return the answer.
Input format :
Numeric string S (string, Eg. "1234")
Output format :
Corresponding integer N (int, Eg. 1234)
 */
	public static int convertStringToInt(String input){
		// Write your code here
if(input.length()==1)
            return input.charAt(0)-'0';
        int ans=convertStringToInt(input.substring(1));
        int x= input.charAt(0)-'0';
        x= x*(int)Math.pow(10,input.length()-1)+ans;
        return x;

	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(convertStringToInt(input));
	}
