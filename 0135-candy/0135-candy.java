class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] candles = new int[n];
        Arrays.fill(candles,1);
        for(int i=1;i<n;i++){
            if(ratings[i]>ratings[i-1]){
                candles[i]=candles[i-1]+1;
            }
        }
        for(int i=n-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                candles[i]=Math.max(candles[i],candles[i+1]+1);
            }
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=candles[i];
        }
        return sum;
    }
}