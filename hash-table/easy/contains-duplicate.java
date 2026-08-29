class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length-1;i++){
        //     if(nums[i]==nums[i+1]){
        //         return true;
        //     }
        // }return false;

HashMap<Integer,Integer> hm=new HashMap<>();
for(int n:nums){
    hm.put(n,hm.getOrDefault(n,0)+1);
}
for(int i=0;i<nums.length;i++){

if(hm.get(nums[i])>1){
    return true;
}
}
return false;
    }
}