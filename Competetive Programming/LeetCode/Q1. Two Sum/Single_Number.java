class Single_Number {
    public int singleNumber(int[] nums)
    {

        int[] count = new int[nums.length];
        int[] temp = new int[nums.length];
        int single  = 0;
        for (int i = 0; i <= nums.length - 1; i++)
        {
            temp[i] = nums[i];
            for (int j = i + 1; j <= nums.length; j++)
            {
                temp[j] = nums[j];
                if (temp [i] == temp [j])
                {
                    count[i]++;
                }

                else if (count[i] == 1)
                {
                    single = nums[i];
                }

                else if (count[j] == 1)
                {
                    single = nums[j];
                }

            }
        }return single;
    }
}