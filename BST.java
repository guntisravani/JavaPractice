public class BST<Key extends Comparable<Key>, Value>
{
  private Node root;                 //root of BST
  private class Node
  {
    private Key key;                   //key
    private Value val;                 // associated value
    private Node right, left;          // links to subtrees 
    private int N;                     //# of nodes in subtree rooted here.
    
    public Node(Key key, Value val, int N)
    {
      this.key = key;
      this.val = val;
      this.N = N;
    }
    
    public int size()
    {
      return size(root);
    }
    private int size(Node x)
    {
      if(x==null)
        return 0;
      else
        return x.N;
    }
    public Value get(Key key)
    {
      return get(root, key);
    }
    
    private Value get(Node x, Key key)
    {
      // Return value associated with key in the subtree rooted as x; return null if key not present in subtree rooted at x. 
      if(x == null)
        return null;
      int cmp = key.compareTo(x.key);
      if(cmp < 0) 
        return get(x.left, key);
      else if(cmp > 0)
        return get(x.right, key);
      else
        return x.val;
    }
    
    public void put(Key key, Value val)
    {
      //search for key . update if found; grow if table is new  
      root = put(root, key, val);
    }
    private Node put(Node x, Key key, Value val)
    {
      //change key's value to val if key in subtree rooted at x.
      //otherwise, add new node to subtree associating key with val.
      if(x == null) 
        return new Node(key, val, 1);
      int cmp = key.compareTo(x.key);
      if(cmp < 0) 
        x.left = put(x.left, key, val);
      else if(cmp > 0)
        x.right = put(x.right, key, val);
      else
        x.val = val;
      x.N = size(x.left) + size(x.right) + 1;
      return x;
    }
    public Key min()
    {
      return min(root).key;
    }
    private Node min(Node x)
    {
      if(x.left == null)
        return x;
      return min(x.left);
    }
    public Key floor(Key key)
    {
      Node x = floor(root, key);
      if(x == null) 
        return null;
      return x.key;
    }
    private Node floor(Node x, Key key)
    { // if a given key key is less than the key at the root of a BST, then the floor of key must be in the left subtree.
      // If key is greater than the key at the root, then the floor could be in the right subtree, 
      // but only if there is a key smaller than or eual to key in the right subtree; if not(or if key is equal to the key at the root),
      //then the key at the root is the floor of key.
      if(x == null)
        return null;
      int cmp = key.compareTo(x.key);
      if(cmp == 0)
        return x;
      if(cmp < 0)
        return floor(x.left, key);
      Node t = floor(x.right, key);
      if(t!= null)
        return t;
      else
        return x;
    }
    public Key select(int k)
    {
      return select(root, k).key; 
    }
    private Node select(Node x, int k)
    { // return node containing key of rank k.
      if(x == null) 
        return null;
      int t = size(x.left);
      if(t > k) 
        return select(x.left, k);
      else if(t < k)
        return select(x.right, k-t-1);
      else
        return x;
    }
    
    public int rank(Key key)
    {
      return rank(key, root);
    }
    private int rank(Key key, Node x)
    {
      if(x == null)
        return 0;
      int cmp = key.compareTo(x.key);
      if(cmp < 0) 
        return rank(key, x.left);
      else if(cmp > 0)
        return 1+ size(x.left) + rank(key, x.right);
      else
        return size(x.left);
    }
    public void deleteMin()
    {
      root = deleteMin(root);
    }
    private Node deleteMin(Node x)
    {
      if(x.left == null)
        return x.right;
      x.left = deleteMin(x.left);
      x.N = size(x.left) + size(x.right) +1;
      return x;
    }
    public void delete(Key key)
    {
      root = delete(root, key);
    }
    private Node delete(Node x, Key key)
    {
      if(x == null) 
        return null;
      int cmp = key.compareTo(x.key);
      if(cmp < 0)
        x.left = delete(x.left, key);
      else if(cmp > 0)
        x.right = delete(x.right, key);
      else
      {
        if(x.right == null)
          return x.left;
        if(x.left == null)
          return x.right;
        Node t =x;
        x = min(t.right);
        x.right = deleteMin(t.right);
        x.left = t.left;
      }
      x.N = size(x.left) + size(x.right) + 1;
      return x;
    }
    public Iterable<Key> keys()
    {
      return keys(min(), max());
    }
    public Iterable<Key> keys(Key lo, key hi)
    {
      Queue<Key> queue = new Queue<Key>();
      keys(root, queue, lo, hi);
      return queue;
      }
    private void keys(Node x, Queue<Key> queue, Key lo, Key hi)
    {
      if(x == null)
        return;
      int cmplo = lo.compareTo(x.key);
      int cmphi = hi.compareTo(x.key);
      if(cmplo < 0) 
        keys(x.left, queue, lo, hi);
      if(cmplo <= 0 && cmphi >= 0)
        queue.enqueue(x.key);
      if(cmphi > 0)
        keys(x.right, queue, lo, hi);
    }
  }
}
 
      