public class LL {
    private class Node {
        public int data;
        public Node next;

        public Node(int d) {data = d;}
    }

    int m_size;
    Node head, tail;

    public LL()
    {
        m_size = 0;
        head = null;
        tail = null;
    }

    public void add(int data)
    {
        Node n = new Node(data);
        if (m_size == 0)
        {
            head = n;
            tail = n;
        }
        else
        {
            tail.next = n;
            tail = n;
        }
        m_size ++;
    }

    public void set(int idx, int data)
    {
        if (idx < 0 || idx >= m_size)
            throw new IndexOutOfBoundsException();
        Node itr = head;
        for (int i=0; i<idx; i++)
        {
            itr = itr.next;
        }
        itr.data = data;
    }

}
