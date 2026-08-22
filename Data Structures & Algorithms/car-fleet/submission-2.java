class Solution {
    public int carFleet(int target, int[] position, int[] speed) {       
        int n=position.length;
        double [][] arr= new double [n][3];

        for(int i=0; i<n; i++){
            arr[i][0]=position[i];
            arr[i][1]=speed[i];
            arr[i][2]=(double)(target-position[i])/speed[i];
        }

        Arrays.sort(arr, (a,b)->Double.compare(b[0],a[0]));

        int count=0;
        Double lastFleet=-1.0;
        for(int i=0; i<n; i++){
            if(arr[i][2]>lastFleet){
                lastFleet=arr[i][2];
                count++;
            }
        }
        return count;
}}
