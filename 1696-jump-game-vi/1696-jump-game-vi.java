class Solution {
     public int maxResult(int[] nums, int k) {
        if(nums.length==0){
            return 0;
        }

        int maxScore = nums[0];

        PriorityQueue<int[]> pq = new  PriorityQueue<>((a,b)->b[1]-a[1]);
        
        pq.offer(new int[]{0, nums[0]});
        
        for(int i=1; i<nums.length; i++){
          
            while(!(i-pq.peek()[0]<=k)){
                pq.poll();
            }
            
            int[] top = pq.peek();
            maxScore = top[1] + nums[i];
            
            pq.offer(new int[]{i, maxScore});
        }
        return maxScore;
        
    }
}