class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        HashMap<Integer,Integer> hmap = new HashMap<>();
        hmap.put(0,-1);
        
        if(nums.length == 1)
            return false;
        
        for(int i=0;i<n;i++){
            
            sum+=nums[i];
            
            if(hmap.containsKey(sum%k))
            {
                if(i-hmap.get(sum%k)>=2)
                return true;
            }
            else
            {
                hmap.put(sum%k,i);
            }
        }
        
        return false;
    }
}