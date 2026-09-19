class Solution {
    public void sortColors(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int temp=-1;
        int run = 0;
        while(run<nums.length && run<=right){
            
            if(nums[run]==0){
                temp=nums[run];
                nums[run]=nums[left];
                nums[left]=temp; 
                run++;
           left++; 
           }
            else if(nums[run]==2){
                temp=nums[run];
                nums[run]=nums[right];
                nums[right]=temp;
                right--;
            }
            else{
                if(nums[run]==1){
                    run++;
                }
            }
            
        }
    }
}