//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String S = read.readLine();

            Solution ob = new Solution();

            System.out.println(ob.encryptString(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static String encryptString(String S){
        // code here
        int n = S.length();
        String ans = "";
        for(int i=0;i<n;i++)
        {
            char ch = S.charAt(i);
            int count=0;
            while(i<n&&S.charAt(i) == ch)
            {
                count++;
                i++;
            }
            i--;
            String hex = ConvertToHexaDecimal(count);
            ans = ans + ch;
            ans = ans + hex;
        }
        char[] charArr = ans.toCharArray();
        charArr = reverse(charArr);
        ans = new String(charArr);
        return ans;
    }
    static char[] reverse(char[] ch)
    {
        int i = 0;
        int j = ch.length-1;
        while(i<j)
        {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        return ch;
    }
    static String ConvertToHexaDecimal(int num)
    {
        String temp = "";
        while(num != 0)
        {
            int rem = num%16;
            char ch;
            if(rem < 10)
            {
                ch = (char)(rem + 48);
            }
            else
            {
                ch = (char)(rem + 87);
            }
          temp = temp + ch;
          num = num/16;
        }
        return temp;
    }
};