//{ Driver Code Starts
import java.util.Scanner;
import java.util.*;

class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int N = sc.nextInt();
			
			Solution ob = new Solution();
			System.out.println(ob.convertToRoman(N));
			t--;
		}
	}
}
// } Driver Code Ends


//User function template for JAVA

class Solution
{
	String convertToRoman(int n) {
		//code here
		char[] c = new char[10001];
		int i=0;
		if(n<=0)
		{
		    return "-1";
		}
		//Check for every number
		while(n!=0)
		{
		    if(n>=1000)
		    {
		        i = addDigit('M',n/1000,i,c);
		        n = n%1000;
		    }
		    else if(n>=500)
		    {
		        if(n < 900)
		        {
		            i = addDigit('D',n/500,i,c);
		            n = n%500;
		        }
		        else
		        {
		            i = subDigit('C','M',i,c);
		            n=n%100;
		        }
		    }
		    else if(n>=100)
		    {
		        if(n < 400)
		        {
		            i = addDigit('C',n/100,i,c);
		            n=n%100;
		        }
		        else 
		        {
		            i = subDigit('C','D',i,c);
		            n=n%100;
		        }
		    }
		    else if(n>=50)
		    {
		        if(n < 90)
		        {
		            i = addDigit('L',n/50,i,c);
		            n=n%50;
		        }
		        else
		        {
		            i = subDigit('X','C',i,c);
		            n=n%10;
		        }
		    }
		    else if(n>=10)
		    {
		        if(n < 40)
		        {
		            i= addDigit('X',n/10,i,c);
		            n=n%10;
		        }
		        else
		        {
		            i = subDigit('X','L',i,c);
		            n=n%10;
		        }
		    }
		    else if(n>=5)
		    {
		        if(n < 9)
		        {
		            i = addDigit('V',n/5,i,c);
		            n=n%5;
		        }
		        else
		        {
		            i=subDigit('I','X',i,c);
		            n=0;
		        }
		    }
		    else if(n>=1)
		    {
		        if(n < 4)
		        {
		            i = addDigit('I',n/1,i,c);
		            n=0;
		        }
		        else
		        {
		            i = subDigit('I','V',i,c);
		            n=0;
		        }
		    }
		}
		    String ans = "";
		    for(int k=0;k<i;k++)
		    {
		        ans = ans + c[k];
		    }
		    return ans;
		
	}
	int addDigit(char ch, int n, int i, char[] c)
	{
	    for(int j=0;j<n;j++)
	    {
	        c[i++] = ch;
	    }
	    return i;
	}
	int subDigit(char ch1, char ch2, int i,char[] c)
	{
	    c[i++] = ch1;
	    c[i++] = ch2;
	    return i;
	}
}