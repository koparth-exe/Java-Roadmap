class Variables
{
    int i, j,  x, y, sum, num1, num2;
}

class Solution
{
    public int[] twoSum(int[] nums, int target)
    {
        Variables obj1 = new Variables();
        int[] array = {2, 7, 11, 15};
        int myTarget = 9;
        System.out.println("Target number: "+myTarget);
        for(obj1.i = 0; obj1.i<array.length; obj1.i++)
        {
            obj1.x = array [obj1.i];
            for(obj1.j = obj1.i + 1; obj1.j < array.length; obj1.j++)
            {
                obj1.y = array[obj1.j];

                obj1.sum = obj1.x+obj1.y;
                if (obj1.sum == target)
                {
                    System.out.println(obj1.x+" + "+ obj1.y+" = "+obj1.sum);
                    return new int[] {obj1.i,obj1.j};
                }

            }
        }
        System.out.println("No such Element present");
        return new int[] {};
    }
}