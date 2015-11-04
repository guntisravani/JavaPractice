import java.util.*;

public class Array1 {
  ArrayList<ArrayList<Integer>> performOps(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < A.size(); i++) {
            B.add(new ArrayList<Integer>());
        
            for (int j = 0; j < A.get(i).size(); j++) {
                B.get(i).add(0);
            }

            for (int j = 0; j < A.get(i).size(); j++) {
                B.get(i).set(A.get(i).size() - 1 - j, A.get(i).get(j));
            }
        }
        return B;
}
public static void main(String[] args) {
  List<List<Integer>> A = List.newArrayList();
A.add(List.newArrayList(1,2,3,4 ));
A.add(List.newArrayList(5,6,7,8));
A.add(List.newArrayList(9,10,11,12));
//  int[] A = [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]];
ArrayList<ArrayList<Integer>> B = performOps(A);
for (int i = 0; i < B.size(); i++) {
    for (int j = 0; j < B.get(i).size(); j++) {
            System.out.print(B.get(i).get(j) + " ");
    }
}
}
}