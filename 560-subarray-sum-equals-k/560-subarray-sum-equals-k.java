class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        int res = 0;
        
        int pre = 0;
        hmap.put(0,1);
        
        for(int i=0;i<nums.length;i++){
            pre+=nums[i];
            
            if(hmap.containsKey(pre-k)){
                res+= hmap.get(pre-k);
            }
            hmap.put(pre,hmap.getOrDefault(pre,0)+1);
        }        
        return res;
    }
}