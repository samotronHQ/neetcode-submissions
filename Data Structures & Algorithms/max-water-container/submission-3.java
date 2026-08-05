class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int i=0;
        int j=n-1;
        int area;
        int max=Math.abs(i-j)*Math.min(heights[i],heights[j]);
        while(i<j){
            area=Math.abs(i-j)*Math.min(heights[i],heights[j]);
            if(heights[i]<heights[j])
            i++;
            else
            j--;
            if(area>max){
            max=area;}

        }
        return max;
    }
}
