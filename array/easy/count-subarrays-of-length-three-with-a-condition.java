class Solution {
    public int countSubarrays(int[] nums) {
        int count=0;
        int left=0;
        int right=2;
        for(int i=1;i<nums.length-1;i++){
            if(2*(nums[left]+nums[right])==nums[i]){
                count++;
                left++;
                right++;
            }else{
                left++;
                right++;
            }
        }return count;
    }
}