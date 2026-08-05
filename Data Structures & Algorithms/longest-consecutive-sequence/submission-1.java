class Solution {
    public int longestConsecutive(int[] nums) {

        if (nums.length==0) return 0;
        if (nums.length==1) return 1;

        Set<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }

        int length=1;
        int max=1;
        for(int n: set){
            if(!set.contains(n-1)){
                length=1;
                int current=n;
                while(set.contains(current+1)){
                    length++;
                    current++;
                }
                 max=Math.max(max, length);
            }
        }   
        return max;
    }
       
}
