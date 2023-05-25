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
                string a = Console.ReadLine().Trim();
                string b = Console.ReadLine().Trim();
                Solution obj = new Solution();
                bool res = obj.areIsomorphic(a,b);
                if(res){
                    Console.Write("1");
                }
                else{
                    Console.Write("0");
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
        public bool areIsomorphic(string a, string b)
        {
            //Your code here
            if(a.Length != b.Length){return false;}
            char c ='a';
            Dictionary<char, char> mapvalues = new Dictionary<char,char>();
            for(int i=0;i<a.Length;i++)
            {
                if(mapvalues.ContainsKey(a[i]) && mapvalues.TryGetValue(a[i],out c))
                {
                    if(c!=b[i])
                    {
                        return false;
                    }
                }
                // This value will not be contained previously
                //For ex- > pijthbsfy  we are having same value 'f' for all different keys p,y
                           //fvladzpbf
                else if(!mapvalues.ContainsValue(b[i]))   
                {
                    mapvalues.Add(a[i],b[i]);
                }
                else
                {
                    return false;
                }
            }
            return true;
        }

    }

