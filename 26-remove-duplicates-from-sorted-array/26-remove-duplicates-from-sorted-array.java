class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> hs = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(hs.contains(nums[i])){
                continue;
            }
            else
                hs.add(nums[i]);
        }
        
        for(int i=0;i<hs.size();i++)
            nums[i] = hs.get(i);
        
        return hs.size();
    }
}