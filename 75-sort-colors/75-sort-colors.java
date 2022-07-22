class Solution {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }

        int zeros = 0;
        int twos = nums.length - 1;
        int i = 0;

        while (i <= twos) {
            if (nums[i] == 0) {
                swap(nums, i, zeros);
                zeros++;
                
                i++;
            } else if (nums[i] == 2) {
                swap(nums, i, twos);
                twos--;
                
            } else {
                
                i++;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        if (i != j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}