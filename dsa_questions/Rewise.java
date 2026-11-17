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
  
}
---------------------------------pratice daily trust process
  3.maximum product subarray leeetcode 152
  class Solution {
    public int maxProduct(int[] arr) {
        int prod1 = arr[0],prod2 = arr[0],result = arr[0];
    
    for(int i=1;i<arr.length;i++) {
        int temp = Math.max(arr[i],Math.max(prod1*arr[i],prod2*arr[i]));
        prod2 = Math.min(arr[i],Math.min(prod1*arr[i],prod2*arr[i]));
        prod1 = temp;
        
        result = Math.max(result,prod1);
    }
    
    return result;
    }
}
---------------------------------pratice daily trust process
4.238. Product of Array Except Self
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] left = new int[n];
        int[] right=new int[n];
        
        left[0]=1;
        right[n-1]=1;
        for(int i=1;i<n;i++)
        {
            left[i]=left[i-1]*nums[i-1];
        }
        for(int i=n-2;i>=0;i--)
        {
            right[i]=right[i+1]*nums[i+1];
        }
        int[] op=new int[n];
        for(int i=0;i<n;i++)
        {
            op[i]=left[i]*right[i];
        }
     return op;
        
    }
}
---------------------------------pratice daily trust process
