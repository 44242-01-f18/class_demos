public class BSTree {
    private class Node
    {
        int data;
        Node left, right;
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

}
