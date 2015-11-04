public class CycleTest {
 public static void main(String[] args) {
    CycleList cycleList = new CycleList();
    cycleList.appendToTail(new CycleList.Node("100")); 
    CycleList.Node cLink = new CycleList.Node("200");  
    cycleList.appendToTail(cLink);
    cycleList.appendToTail(new CycleList.Node("300")); 
    cycleList.appendToTail(new CycleList.Node("400")); 
    cycleList.appendToTail(cLink);
    
    if(cycleList.isLoop()) {
      System.out.println("Linked list is a cyclic as it contains cycles or loop");
    } else {
      System.out.println("Linked list is not cyclic as it doesnot contains cycles or loop");
    }
  }
}