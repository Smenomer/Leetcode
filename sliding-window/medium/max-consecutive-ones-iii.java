class Solution {
    public int longestOnes(int[] nums, int k) {
       int count=0; 
       int max=0; 
       int left=0; 
       int right=0;
       for(right=0;right<nums.length;right++){
        if(nums[right]==0){
            k--;
        }
        while(k<0){
            if(nums[left]==0){
                k++;
            }
            left++;
            
        }max=Math.max(max,right-left+1); 
       }return max;
    }
}


//t=k
//for loop
//if 1 then count++
//if 0 then while t<=k 0=1
//count ++,t--
//if t==0 num==0 reset t max(count,max)

