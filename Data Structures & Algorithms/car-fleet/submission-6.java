class Solution {
    public int carFleet(int target, int[] position, int[] speed) {       
        int n=position.length;
        int [][] arr= new int [n][2];
        double [] time = new double [n];

        for(int i=0; i<n; i++){
            arr[i][0]=position[i];
            arr[i][1]=speed[i];
        }

        Arrays.sort(arr, (a,b)->Integer.compare(b[0],a[0]));

        for(int i=0; i<n; i++){
            time[i]=((double)(target-arr[i][0]))/arr[i][1];
        }
        int count=0;
        double lastFleet=-1.0;
        for(int i=0; i<n; i++){
            if(time[i]>lastFleet){
                lastFleet=time[i];
                count++;
            }
        }
        return count;
}}

