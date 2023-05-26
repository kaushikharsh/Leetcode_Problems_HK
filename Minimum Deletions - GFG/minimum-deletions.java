//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String S = read.readLine();

            Solution ob = new Solution();
            
            System.out.println(ob.minimumNumberOfDeletions(S));
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int minimumNumberOfDeletions(String S) {
        //your code here
        int n = S.length();
        Integer arr[][] = new Integer[n+1][n+1];
        //Recursive to DP 
        return n - lps(S,0,n-1,arr);
    }
    static int lps(String s,int start, int end,Integer[][] arr)
    {
        if(start > end)
        {
            return 0;
        }
        if(start == end)
        {
            return 1;
        }
        if(arr[start][end] == null)
        {
            if(s.charAt(start) == s.charAt(end))
            {
                arr[start][end]  = 2 + lps(s,start+1,end-1,arr);
            }
            else
            {
                arr[start][end] = Math.max(lps(s,start+1,end,arr),lps(s,start,end-1,arr));
            }   
        }
        return arr[start][end];
        
    }
}