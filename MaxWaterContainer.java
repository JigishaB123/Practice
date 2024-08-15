class Solution {
    public int maxArea(int[] heights) {
        int l = 0, r = heights.length-1;
        int max =0, sec_max = 0, prod = 0;
        while(r > l){
            prod = (r-l) * (Math.min(heights[l], heights[r]));
            if(prod > max){
                sec_max = max;
                max = prod;
            }
            if(heights[l] <= heights[r])
                l++;
            else
                r--;
        }
        return max;
    }
}
