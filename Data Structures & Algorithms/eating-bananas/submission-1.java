class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int left =1; //k=1 minimum;
        int right=0;
        for (int pile : piles) {
            right = Math.max(right, pile);
        }
        int hrs=0;
        int k=Integer.MAX_VALUE;

        if(piles.length==h) return right;

        while (left<=right){
            int mid= left+(right-left)/2;
            hrs=0;

            for(int i=0; i<piles.length; i++){
                hrs=hrs+(piles[i]/mid);
                if(piles[i]%mid>0)hrs++;
            }
            
            if(hrs<=h){
                k=Math.min(k,mid);
                right=mid-1;  
            }
            else if(hrs>h){
                left=mid+1;
            }
        }

        return k;
        
    }
}
