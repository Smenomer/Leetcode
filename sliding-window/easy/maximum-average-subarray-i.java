class Solution {
    public double findMaxAverage(int[] nums, int k) {
       
        int sum=0;
        if(nums.length==1){
            return nums[0];
        }
   int left=0;
   int right=k;
   for(int i=0;i<k;i++){
    sum+=nums[i];
   }
   double max = (double) sum / k;
   while(right<nums.length){
   
        sum-=nums[left];
        sum+=nums[right];
     double avg = (double) sum / k;
        left++;
        right++;
        max=Math.max(max,avg);
   }return max;
}
}
