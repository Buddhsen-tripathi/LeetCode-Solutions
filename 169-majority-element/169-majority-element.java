class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
            hmap.put(nums[i],hmap.getOrDefault(nums[i],0)+1);
        
        int max = 0;
        int res = 0;
        for(int i=0;i<nums.length;i++){
            if(hmap.get(nums[i]) > max)
            {
                max = hmap.get(nums[i]);
                res = nums[i];
            }
        }
        return res;
    }
}