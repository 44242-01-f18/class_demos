public class BSTree {
    private class Node
    {
        int data;
        Node left, right;

        public Node(int d) {data = d;}
    }

    private Node root;

    // determine whether the value is in the subtree
    // rooted at Node n
    private boolean search(int value, Node n)
    {
        if (n == null) return false; // value not in the tree
        if (n.data == value)
            return true;
        if (value < n.data)
            return search(value, n.left);
        return search(value, n.right);
    }

    public boolean search(int value)
    {
        return search(value, root);
    }

    public boolean iterSearch(int value)
    {
        Node n = root;
        while (n != null)
        {
            if (n.data == value) return true;
            else if (value < n.data) n = n.left;
            else n = n.right;
        }
        return false;
    }

    private void insert(int value, Node n)
    {
        if (value < n.data)
        {
            if (n.left == null)
                n.left = new Node(value);
            else
                insert(value, n.left);
        }
        else if (value > n.data)
        {
            if (n.right == null)
                n.right = new Node(value);
            else
                insert(value, n.right);
        }
    }

    public void insert(int value)
    {
        if (root == null)
            root = new Node(value);
        else
            insert(value, root);
    }

    public void inOrderPrint()
    {
        inOrderPrint(root);
        System.out.println();
    }

    private void inOrderPrint(Node n)
    {
        if (n == null) return;
        inOrderPrint(n.left);
        System.out.print(n.data + " ");
        inOrderPrint(n.right);
    }

    public void preOrderPrint()
    {
        preOrderPrint(root);
        System.out.println();
    }

    private void preOrderPrint(Node n)
    {
        if (n == null) return;
        System.out.print(n.data + " ");
        preOrderPrint(n.left);
        preOrderPrint(n.right);
    }

    public void postOrderPrint()
    {
        postOrderPrint(root);
        System.out.println();
    }

    private void postOrderPrint(Node n)
    {
        if (n == null) return;

        postOrderPrint(n.left);
        postOrderPrint(n.right);
        System.out.print(n.data + " ");
    }

    public static void main(String args[])
    {
        BSTree bt = new BSTree();
        bt.insert(5);
        bt.insert(7);
        bt.insert(-1);
        bt.insert(100);
        bt.insert(15);
        bt.insert(27);
        bt.insert(2);

        bt.inOrderPrint();
        bt.preOrderPrint();
        bt.postOrderPrint();
    }


}
