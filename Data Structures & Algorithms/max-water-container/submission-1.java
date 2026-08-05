class Solution {
    public int maxArea(int[] heights) {

        int max=0;
        int min=0;
        int left=0;
        int right=heights.length-1;

        while (left<right){
            min=Math.min(heights[left],heights[right]);
            int dist= right-left;
            int area= min*dist;
            max=Math.max(max,area);
            if(heights[left]<heights[right]) left++;
            else right--;
        }
        
        return max;
    }
}
