//{ Driver Code Starts
//Initial Template for C#

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DriverCode
{

    class GFG
    {
        static void Main(string[] args)
        {
            int testcases;// Taking testcase as input
            testcases = Convert.ToInt32(Console.ReadLine());
            while (testcases-- > 0)// Looping through all testcases
            {
                

                string s = Console.ReadLine().Trim();
                
                Solution obj = new Solution();
                string res = obj.reverseWords(s);
                Console.Write(res);
                Console.Write("\n");
          }

        }
    }
    
}


// } Driver Code Ends


//User function Template for C#



class Solution
    {
        //Complete this function
        public string reverseWords(string s)
        {
            string[] arr = s.Split('.');
            string ans = "";
            for(int i=arr.Length-1;i>=0;i--)
            {
                ans = ans + arr[i] + '.';
            }
            return (ans.Substring(0,ans.Length-1));
            //Your code here
        }

    }