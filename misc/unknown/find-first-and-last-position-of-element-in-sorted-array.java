class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ind=new int[2];
        ind[0]=-1;
        ind[1]=-1;
        if(nums.length==0){
            return ind; 
        }
        int ans=-1;
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                ans=mid;
                right=mid-1;
            }
            else if(nums[mid] < target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }ind[0]=ans;
        left=0;
        right=nums.length-1;
        ans=-1;
         while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                ans=mid;
                left=mid+1;
            }
            else if(nums[mid] < target){
                left=mid+1;
            }else{
                right=mid-1;
            }ind[1]=ans;
        }ind[1]=ans;
        return ind;
    }
}












