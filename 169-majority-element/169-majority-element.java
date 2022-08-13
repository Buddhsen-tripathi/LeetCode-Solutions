class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        ArrayList<Integer> al = new ArrayList<>();
        
        for(int i=0;i<nums.length;i++)
        {
            hmap.put(nums[i],hmap.getOrDefault(nums[i],0)+1);
            if(!al.contains(nums[i])) al.add(nums[i]);
        }
        
        System.out.println(al);
        System.out.println(hmap);
        
        int res = 0;
        for(int i=0;i<al.size();i++){
            if(hmap.get(al.get(i)) > (nums.length)/2)
            {
                res = al.get(i);
            }
        }
        return res;
    }
}