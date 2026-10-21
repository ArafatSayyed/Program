class Solution
{
    public int calPoints(String[] operations)
    {
        Stack<Integer> s1 = new Stack<>();
        for (String op : operations)
        {
            if (op.equals("C"))
            { 
                s1.pop();
            }
            else if (op.equals("D"))
            {
                s1.push(s1.peek() * 2);
            }
            else if (op.equals("+"))
            {
                int top = s1.pop();
                int secondTop = s1.peek();
                s1.push(top); s1.push(top + secondTop);
            }
            else
            {
                s1.push(Integer.parseInt(op));
            } 
        }
        int sum = 0;
        while (!s1.isEmpty())
        {
            sum += s1.pop();
        }
        return sum;
    }
}
