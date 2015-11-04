public class CycleList {
  private Node head;
  public CycleList() {
    this.head = new Node("head");
  }
  public Node head() {
    return head;
  }
  public void appendToTail(Node node) {
    Node current = head;
    while (current.next() != null) {
      current = current.next;
    }
    current.setNext(node);
  }
  
  public boolean isLoop() {
    Node fast = head;
    Node slow = head;
    while (fast != null  && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
      if(fast == slow) {
        return true;
      }
    }
    return false;
  }   
  public static class Node {
    private Node next;
    private String data;
    
    public Node(String data) {
      this.data = data;
    }
    public String data() {
      return data;
    }
    public void setData(String data) {
      this.data = data;
    }
    public Node next() {
      return next;
    }
    public void setNext(Node next) {
      this.next = next;
    }
  }
  
 
 }