class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        //number of rows m
        //number of cols n
        
        int m=matrix.length;
        int n=matrix[0].length;

        int left= 0;
        int right= m*n -1;

        while(left<=right){

            int mid= (left+right)/2;
            int row=mid/n;
            int col=mid%n;
            int element=matrix[row][col];


            if (target==element){
                return true;
            }
            else if(target<element){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return false;
    }
}
