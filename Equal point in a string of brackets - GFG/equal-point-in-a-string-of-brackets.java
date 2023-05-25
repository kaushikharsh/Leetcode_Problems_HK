//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            String str = br.readLine();
            
            Solution obj = new Solution();
            System.out.println(obj.countSub(str));
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java

class Solution {
    public long countSub(String str) {
        // Your code goes here
        int l = 0;
        int r = str.length()-1;
        while(l<r)
        {
            while(str.charAt(l) != '(' && l<r) l++; // We doesn't want to count left closed brackets that is why we are skipping
            while(str.charAt(r) != ')' && l<r) r--;
            if(l<r)
            {
                l++;
                r--;
            }
        }
        if(l>r)
        {
            return l;
        }
        if(l==r && str.charAt(l) == '(')
        {
            return l;
        }
        return l+1;
        
    }
}