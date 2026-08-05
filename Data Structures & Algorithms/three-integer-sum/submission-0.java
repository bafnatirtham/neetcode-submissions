class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> answer = new ArrayList<>();

        int n = nums.length;
        for(int i=0; i<n-2; i++){
            //chose nums[i]
            if(i>0 && nums[i]==nums[i-1]) //if duplicate found
                continue;
            
            int left=i+1;
            int right=n-1;

            while(left<right){

                int sum= nums[i]+nums[left]+nums[right];

                if (sum==0){
                    answer.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    left++;
                    while(left<right && nums[left]==nums[left-1])
                        left++;//skip duplicates

                    right--;
                    while(left<right && nums[right]==nums[right+1])
                        right--;//skip duplicates
                    
                }
                else if(sum<0) left++;
                else right--;
            }
        }
        return answer;
    }
}
