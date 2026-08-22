class Solution {
    public int search(int[] nums, int target) {
        int left=0;
        int right =nums.length-1;
        
        while(left<=right){
            int mid=(left+right)/2;
            int element=nums[mid];

            if(target==element)
                return mid;
            else if(target>element)
                left=mid+1;
            else if(target<element)
                right=mid-1;
        }
        return -1;
    }
}
