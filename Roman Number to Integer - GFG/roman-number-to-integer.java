//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String roman = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.romanToDecimal(roman));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        // code here
        int res=0;
        int n = str.length();
        for(int i=0;i<n;i++)
        {
            int r1 = value(str.charAt(i));
            if(i<n-1)
            {
                int r2 = value(str.charAt(i+1));
                if(r1>=r2)
                {
                    res = res + r1;  // for roman[i] > roman[i+1] then simple addition
                }
                else
                {
                    res = res + r2-r1;  // for roman[i] < roman[i+1] then we have to subtraction i.e roman[i+1] - roman[i]
                    i++;
                }
            }
            else
            {
                res = res + r1;
                i++;
            }
        }
        return res;
    }
    public int value(char ch)
    {
        switch(ch)
        {
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
        }
        return -1;
    }
}