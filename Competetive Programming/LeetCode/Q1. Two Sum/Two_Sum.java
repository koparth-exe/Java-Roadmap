class Variables
{
    int i, j,  x, y;
}

class Solution
{
    public int[] twoSum(int[] nums, int target)
    {
        Variables obj1 = new Variables();

        for(obj1.i = 0; obj1.i<nums.length; obj1.i++) {
            obj1.x = nums[obj1.i];
            for (obj1.j = obj1.i + 1; obj1.j < nums.length; obj1.j++) {
                obj1.x = nums[obj1.i];
                obj1.y = nums[obj1.j];

                if (obj1.x + obj1.y == target) {
                    return new int[]{obj1.i, obj1.j};
                }

            }
        }
        return new int[] {};
    }
}
//Runtime
//68 ms Beats 5.91%
//Memory
//46.83 MB Beats 84.97%.
