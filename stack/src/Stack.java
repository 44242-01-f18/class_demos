import java.util.LinkedList;
public class Stack {
    private LinkedList<Integer> _stack;

    public Stack()
    {
        _stack = new LinkedList<>();
    }

    public void push(Integer val)
    {
        _stack.addFirst(val);
    }

    public Integer pop()
    {
        return _stack.removeFirst();
    }

    public Integer top()
    {
        return _stack.getFirst();
    }

    public static void main(String args[])
    {
        Stack vals = new Stack();
        String math = "9 3 5 + -"; // 9 - (3 + 5)
        String[] tokens = math.split("\\s+");
        for (String s: tokens)
        {
            if (s.equals("+"))
            {
                Integer i1, i2;
                i1 = vals.pop();
                i2 = vals.pop();
                vals.push(i2+i1);
            }
            else if (s.equals("-"))
            {
                Integer i1, i2;
                i1 = vals.pop();
                i2 = vals.pop();
                vals.push(i2-i1);
            }
            else
            {
                vals.push(Integer.parseInt(s));
            }
        }
        System.out.println(vals.top());
    }
}
