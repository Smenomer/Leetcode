class Solution {
    public boolean isHappy(int n) {
        int sum=0;
        HashSet<Integer> hm=new HashSet<>();
        while(n!=1){
          if(  hm.contains(n) ){
            return false;
          }
          hm.add(n);
          sum=0;
          while(n>0){
            int rem=n%10;
             n/=10;
             sum+=rem*rem;
        }
         n=sum;            
    }return true;
}
}