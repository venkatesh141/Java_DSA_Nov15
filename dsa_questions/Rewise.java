1.Maximum subarray Leetcode 53

  class Solution {
    public int maxSubArray(int[] nums) {
        
        int max=Integer.MIN_VALUE,sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            sum+=nums[i];
             if(sum>max)
            {
                max=sum;
            }
            if(sum<0)
            {
                sum=0;
            }
           
        }
        return max;
    }
}
------------practice daily trust process
2.Best time to buy and sell stock (leetcode 121)

  class Solution {
    public int maxProfit(int[] prices) {
        
        int profit=0,best_time=prices[0];
        int n=prices.length;
        for(int i=1;i<n;i++)
        {
            if(best_time>prices[i])
            {
                best_time=prices[i];
            }
            if(profit<(prices[i]-best_time))
            {
                profit=prices[i]-best_time;
            }
        }
        return profit;
    }
  ------------practice daily trust process
}
