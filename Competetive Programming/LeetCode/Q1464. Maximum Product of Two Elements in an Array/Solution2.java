class Solution {
    public int maxProduct(int[] nums){
        Arrays.sort(nums);
        int i = nums.length - 1;
        int j = nums.length - 2;
        return ((nums[i] - 1) * (nums[j] -1));
    }
}

// Another better(Best) approach

class Solution2 {
    public int maxProduct(int[] nums){
        int max1 = 0;
        int max2 = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] > max1){
                max2 = max1;
                max1 = nums[i];
            }
            else if (nums[i] > max2){
                max2 = nums[i];
            }
        }
        return ((max1 - 1) * (max2 -1));
    }
}
//Runtime
//0
//ms
//        Beats
//100.00%
//Memory
//44.17
//MB
//        Beats
//97.04%
