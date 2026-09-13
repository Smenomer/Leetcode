class Solution {
    public int heightChecker(int[] heights) {
        int[] nums=new int[heights.length];
        int count=0;
        for(int i=0;i<heights.length;i++){
            nums[i]=heights[i];
        }
        Arrays.sort(heights);
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=heights[j]){
                count++;
            }
        }
    return count;
     
    }
}