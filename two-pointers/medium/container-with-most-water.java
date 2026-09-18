class Solution {
    public int maxArea(int[] height) {
        // int i=0;
        // int j=height.length-1;
        // int max=0;

        // while(i<j){
        //     int width=j-i;
        //     int H =Math.min(height[i],height[j]);
        //     int area=width * H;
        //     max=Math.max(area,max);

        //     if (height[i]<height[j]){
        //         i++;
        //     }else{
        //         j--;
        //     }
        // }return max;

        int i=0;
        int j=height.length-1;
        int max=0;
        while(i<j){
            int width=j-i;
            int h=Math.min(height[i],height[j]);
            int area=h*width;
            max=Math.max(area,max);

            if(height[i]<height[j]){
                i++;
            }
            else {
                j--;
            }
        }return max;
    }
}