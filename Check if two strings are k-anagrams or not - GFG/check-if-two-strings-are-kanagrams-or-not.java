//{ Driver Code Starts
//Initial template for JAVA

import java.util.*;
import java.lang.*;
class GFG {
    public static void main(String[] args)
    {   Scanner sc = new Scanner(System.in);
    	int t=sc.nextInt();
    	while(t-->0)
    	{
    		String str1=sc.next();
    		String str2=sc.next();
    		int k=sc.nextInt();
            Solution ob = new Solution();
    		if (ob.areKAnagrams(str1, str2, k) == true)
    			System.out.println("1");
    		else
    			System.out.println("0");
    	}
    }
}
// } Driver Code Ends


//User function template for JAVA

class Solution {
    boolean areKAnagrams(String s1, String s2, int k) {
        // code here
        int n = s1.length();
        //Edge Case
        if(n!=s2.length())
        return false;
        
        int maxsize = 26;
        int[] hashArr = new int[maxsize];
        for(int i=0;i<n;i++)
        {
            hashArr[s1.charAt(i)-'a']++;
        }
        int count=0;  // counting all different characters
        for(int i=0;i<n;i++)
        {
            if(hashArr[s2.charAt(i) - 'a'] > 0)
            hashArr[s2.charAt(i) - 'a']--;  // decreasing the characters frequency by 1 from the hashArr
            else
            count++;
            if(count > k)
            return false;
        }
        return true;
    }
}