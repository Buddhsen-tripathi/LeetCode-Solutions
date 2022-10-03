class Solution {
    public int minCost(String colors, int[] neededTime) {
        int n=neededTime.length;

        int ans=0;
        int sum=neededTime[0];
        int max=sum;

        for(int i=1;i<n;i++){
            if(colors.charAt(i)==colors.charAt(i-1)){
                sum+=neededTime[i];
                max=Math.max(max,neededTime[i]);

            }else{
                ans+=(sum-max);
                sum=neededTime[i];
                max=sum;
            }
        }
        ans+=(sum-max);
        return ans;
    }
}