class Solution {
    public boolean isPalindrome(int x) {
        int rem=0;
        int original=x;
        int rev=0;

        while(x>0){
            rem=x%10;
            x=x/10;
            rev=(rev*10)+rem;

            
        }return original==rev;
    }
}