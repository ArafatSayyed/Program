class Solution
{
    public void sortColors(int[] nums)
    {
        int n = nums.length;
        int NoZ = 0;
        int NoO = 0;
        int NoT = 0;
        for (int ele : nums)
        {
            if (ele == 0)
            {
                NoZ++;
            }
            if (ele == 1)
            {
                NoO++;
            }
            if (ele == 2)
            {
                NoT++;
            }
        }
        for (int i = 0; i < NoZ; i++)
        {
            nums[i] = 0;
        }
        for (int i = NoZ; i < NoZ + NoO; i++)
        {
            nums[i] = 1;
        }
        for (int i = NoZ + NoO; i < n; i++)
        {
            nums[i] = 2;
        }
    }
}
