class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pre = 1;
        int [] newnums = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            newnums[i] = pre;
            pre = pre*nums[i];
        }
        pre = 1;
        for(int i=nums.length-1;i>=0;i--){
            newnums[i] = pre*newnums[i];
            pre*=nums[i];
        }
        return newnums;
    }
}