class Solution {
    public int search(int[] nums, int target) {

        int left=0;
        int size=nums.length;
        int right=size-1;

        while(left<right){
            int mid= left+(right-left)/2;
            if(nums[mid]>nums[right])
            left=mid+1;
            else right=mid;
        }

        int l=left;//logical index start
        int r=left+(size-1);//logical index end
    
        while(l<=r){
            int mid=l+(r-l)/2;
            int ele=nums[mid%size];

            if(ele==target){
                return mid%size;
            }
            else if(ele>target){
                r=mid-1;
            }
            else l=mid+1;
        }
    return -1;
    }   
}
    