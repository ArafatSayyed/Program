class Solution
{
    public ArrayList<Integer> spiralOrder(int[][] matrix)
    {
        ArrayList<Integer> ans = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;
        int minr = 0;
        int maxr = m - 1;
        int minc = 0;
        int maxc = n - 1;
        while (minr <= maxr && minc <= maxc)
        {
            for (int j = minc; j <= maxc; j++)
            {
                ans.add(matrix[minr][j]);
            }
            minr++;
            for (int i = minr; i <= maxr; i++)
            {
                ans.add(matrix[i][maxc]);
            }
            maxc--;
            if (minr <= maxr)
            {
                for (int j = maxc; j >= minc; j--)
                {
                    ans.add(matrix[maxr][j]);
                }
                maxr--;
            }
            if (minc <= maxc)
            {
                for (int i = maxr; i >= minr; i--)
                {
                    ans.add(matrix[i][minc]);
                }
                minc++;
            }
        }
        return ans;
    }
}
