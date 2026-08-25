class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
          hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }if(hm.containsKey(k)==false){
            return k;
        }else{
            for(int j=2;j<=nums.length+1;j++){
                if(hm.containsKey(k*j)==false){
                    return k*j;
                }
            }

        }return k;
    }
}