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
                bool res = obj.checkPangram(s);
                if(res == true){
                    Console.Write(1);
                }
                else{
                    Console.Write(0);
                }
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
        public bool checkPangram(string s)
        {
            //Your code here
            int n = s.Length;
            int maxSize = 26;
            bool[] hashArr = new bool[maxSize];
            int index = 0; 
            for(int i=0;i<s.Length;i++)
            {
                if(s[i] >= 'a' && s[i] <= 'z')
                index  = s[i] - 'a';
                else if(s[i] >= 'A' && s[i] <= 'Z')
                index = s[i] - 'A';
                else
                continue;
                hashArr[index] = true;
            }
            for(int i=0;i<maxSize;i++)
            {
                if(!hashArr[i])return false;
            }
            return true;
        }

    }
