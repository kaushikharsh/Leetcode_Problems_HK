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
    //     //your code here
        int n = S.length();
        //Integer arr[][] = new Integer[n+1][n+1];
        int[][] arr = new int[n+1][n+1];
        //Recursive to DP 
        //return n - lps(S,0,n-1,arr);
        //BOTTOM UP DP
        return n - lps(S,arr,n);
    }
    // static int lps(String s,int start, int end,Integer[][] arr)
    // {
    //     if(start > end)
    //     {
    //         return 0;
    //     }
    //     if(start == end)
    //     {
    //         return 1;
    //     }
    //     if(arr[start][end] == null)
    //     {
    //         if(s.charAt(start) == s.charAt(end))
    //         {
    //             arr[start][end]  = 2 + lps(s,start+1,end-1,arr);
    //         }
    //         else
    //         {
    //             arr[start][end] = Math.max(lps(s,start+1,end,arr),lps(s,start,end-1,arr));
    //         }   
    //     }
    //     return arr[start][end];
        
    // }
    static int lps(String s, int[][] arr, int n)
    {
        for(int i=0;i<n;i++)
        {
            arr[i][i] = 1;
        }
        for(int i=n-2;i>=0;i--)
        {
            for(int j =i+1;j<n;j++)
            {
                if(s.charAt(i) == s.charAt(j))
                {
                    arr[i][j] = 2 + arr[i+1][j-1];
                }
                else
                {
                    arr[i][j] = Math.max(arr[i+1][j],arr[i][j-1]);
                }
            }
        }
        return arr[0][n-1];   
    }
}