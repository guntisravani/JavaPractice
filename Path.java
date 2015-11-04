//An Algorithm to find a path from one node in a binary tree to another.
// Dist(n1, n2) = Dist(root, n1) + Dist(root, n2) - 2*Dist(root,lca)
//By storing root to n1 and root to n2.
//Time complexity : O(N) ; N is the no. of elements 

public class Path<Item> implements Iterable<Item> {
  private class Node {
    public int data;
    public Node right;
    public Node left;
    public Node(int data) {
      this.data = data;
    }      
  }
  public static Node lca(Node root, Node a, Node b) {
    if(root == null) {
      return null;
    }
    if(root.equals(a) || root.equals(b)) {
      //if atleast one matched, no need to continue and this is the LCA for this root
      return root;
    }
    Node l = lca(root.left, a, b);
    Node r = lca(root.right, a, b);
    if(l != null && r != null) {
      //nodes on seperate branch.
      return root;
    }
    return l != null ? l : r;
      
  }
}
  