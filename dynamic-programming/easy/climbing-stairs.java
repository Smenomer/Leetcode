class Solution {
    public int climbStairs(int n) {
        int[] a=new int[n+1];
        a[0]=1;
        a[1]=1;
        for(int i=2;i<=n;i++){
            a[i]=a[i-1]+a[i-2];
        }return a[n];

    }
}

// class Solution {
//     public int climbStairs(int n) {
//         if(n<=2){
//             return n;
//         }
//             int prev2=1;
//             int prev1=2;

//             for(int i=3;i<=n;i++){
//                 int curr=prev2+prev1;
//                 prev2=prev1;
//                 prev1=curr;
//             }
//             return prev1;
//     }
// }