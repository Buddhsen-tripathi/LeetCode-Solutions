class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        ArrayList<Integer> al = new ArrayList<>();
        
        for(int i=0;i<nums.length;i++)
            hmap.put(nums[i],hmap.getOrDefault(nums[i],0)+1);
        
        for(int i=0;i<nums.length;i++){
            if(hmap.get(nums[i]) > nums.length/3 && (!al.contains(nums[i])))
                al.add(nums[i]);
        }
        
        return al;
    }
}