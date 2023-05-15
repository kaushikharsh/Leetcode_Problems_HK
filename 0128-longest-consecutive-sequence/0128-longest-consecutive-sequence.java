class Solution {
    public int longestConsecutive(int[] nums) {
        // Approach to find the starting point for the cosecutive sequence, when we got the starting
        //then we can find all consecutive just by doing + 1 to it and counting the element
        //1, 2, 3, 4, 5, 6,7
        //8-1 = 7 -> total 7 consecutive elements is there.
        //We can use HashSet to store unique elements
        HashSet<Integer> set = new HashSet<>();
        for(int index=0;index<nums.length;index++)
        {
            set.add(nums[index]);
        }
        //Logic
        int ans = 0;
        for(int index = 0;index < nums.length;index++)
        {
            if(!set.contains(nums[index]-1))
            {
                //then this nums[index] -> is the starting point
                //run a while loop , find all the consecutive with the strating
                //then update the answer
                int j = nums[index];
                while(set.contains(j))
                {
                    j++;
                }
                ans = Math.max(ans,j-nums[index]);
            }
        }
        return ans;
    }
}