class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new LinkedList<>();
        
        Arrays.sort(nums);
        
        int n = nums.length;
        
        for(int i=0;i<n-2;i++){
            int j = i+1;
            int k = n-1;
            
            if (i > 0 && nums[i] == nums[i-1]) continue;
            
            while(j<k){
                if(nums[j] + nums[k] == -nums[i])
                {
                    List<Integer> al = new ArrayList<Integer>();
                    al.add(nums[i]);
                    al.add(nums[j]);
                    al.add(nums[k]);
                    ans.add(al);
                    
                    j++;
                    while(nums[j] == nums[j-1] && j < k) j += 1;
                }
                else if(nums[j] + nums[k] > -nums[i])
                    k--;
                else
                    j++;
            }
        }
        return ans;
    }
}