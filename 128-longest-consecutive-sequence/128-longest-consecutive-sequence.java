class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        
        if(nums.length == 0)
            return 0;
        
        int max = 1;
        int cmax = 1;
        
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1] - nums[i] == 1){
                cmax++;
            }
            else if(nums[i+1] == nums[i])
                continue;
            else
                cmax = 1;
            
            max = Math.max(cmax,max);
        }
        
        return max;
    }
}