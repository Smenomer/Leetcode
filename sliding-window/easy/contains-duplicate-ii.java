class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //          if(nums[i]==nums[j] && Math.abs(i - j) <= k){
        //             return true;
        //          }
        //     }
        // }
        // return false;
       

       HashMap<Integer,Integer> seen =new HashMap<>();
       for(int i=0;i<nums.length;i++){
        int val=nums[i];
        if(seen.containsKey(val) && i - seen.get(val)<=k){
            return true;
        }
        seen.put(val,i);
        
       }
       return false;
       
    }
}