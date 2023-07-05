/*
Merge Sort - Problem Statement
Send Feedback
You are given the starting 'l' and the ending 'r' positions of the array 'ARR'.


You must sort the elements between 'l' and 'r'.


Note:
Change in the input array itself. So no need to return or print anything.
Example:
Input: ‘N’ = 7,
'ARR' = [2, 13, 4, 1, 3, 6, 28]

Output: [1 2 3 4 6 13 28]

Explanation: After applying 'merge sort' on the input array, the output is [1 2 3 4 6 13 28].
Input format :
The first line contains an integer <em>**'N'**</em> representing the size of the array/list.

The second line contains 'N' single space-separated integers representing the elements in the array/list.
Output format :
You don't need to return anything. In the output, you will see the array after you do the modification.
Sample Input 1:
7
2 13 4 1 3 6 28
Sample Output 1:
1 2 3 4 6 13 28
Explanation of Sample Output 1:
After applying 'merge sort' on the input array, the output is [1 2 3 4 6 13 28].
Sample Input 2:
5
9 3 6 2 0
Sample Output 2:
0 2 3 6 9
Explanation of Sample Output 2:
After applying 'merge sort' on the input array, the output is [0 2 3 6 9].
Constraints :
1 <= N <= 10^3
0 <= ARR[i] <= 10^9
*/

public static void mergeSort(int[] arr, int start, int end){
        // Write your code here
    if(start>=end) {
      return ;
    }
    int mid= (start + end)/2;
    mergeSort(arr, start, mid);
    mergeSort(arr,mid+1,end);
    merge(arr,start,end);
  }

private static void merge(int[] arr, int start, int end) {
  int mid=(start + end)/2;
	int i=start,j=mid+1,k=0;
  int[] temp=new int[end-start+1];
		
  while(i<=mid && j <=end) {
    if(arr[i] <= arr[j]) {
      temp[k++]=arr[i++];
    }
    else {
      temp[k++]=arr[j++];
    }
  }
		
  while(i<=mid) {
    temp[k++]=arr[i++];
  }
  while(j<=end) {
    temp[k++]=arr[j++];
  }
  int x=0;
  for(int m=start;m<=end;m++) {
    arr[m]=temp[x++];
  }
}
