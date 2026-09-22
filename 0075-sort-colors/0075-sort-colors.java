class Solution
{
    public void sortColors(int[] nums)
    {
        int n = nums.length;
        int mid = 0;
        int low = 0;
        int high = n - 1;
        while (mid <= high)
        {
            if (nums[mid] == 0)
            {
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                low++;
                mid++; 
            }
            else if (nums[mid] == 1)
            {
                mid++;
            }
            else
            {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--; 
            }
        }
        // int n = nums.length;
        // int NoZ = 0;
        // int NoO = 0;
        // int NoT = 0;
        // for (int ele : nums)
        // {
        //     if (ele == 0)
        //     {
        //         NoZ++;
        //     }
        //     if (ele == 1)
        //     {
        //         NoO++;
        //     }
        //     if (ele == 2)
        //     {
        //         NoT++;
        //     }
        // }
        // for (int i = 0; i < NoZ; i++)
        // {
        //     nums[i] = 0;
        // }
        // for (int i = NoZ; i < NoZ + NoO; i++)
        // {
        //     nums[i] = 1;
        // }
        // for (int i = NoZ + NoO; i < n; i++)
        // {
        //     nums[i] = 2;
        // }
    }
}
