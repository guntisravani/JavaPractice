//Given an image represented by an N * N matrix, where each pixel in the image is 4 bytes, write a method to rotate the 
//image by 90 degrees.
public class Rotate {
  public static void rotate(int[][] matrix, int n) {
    for(int layer = 0;layer < n/2; layer++) {
      int first = layer;
      int last = n - layer;
      for(int i = first; i < last; i++) {
      int offset = i - first;
      //save top
      int top = matrix[first][i];
      //left -> top
      matrix[first][i] = matrix[last - offset][first];
      //bottom -> left
      matrix[last - offset][first] = matrix[last][last - offset];
      //right -> bottom
      matrix[last][last - offset] = matrix[i][last];
      //top -> right
      matrix[i][last] = top;
      }  
    }
  }
   public static void main(String[] args) {
     int[][] input = {{10,20,30},{40,50,60},{70,80,90}};
     for (int i=0; i<3; i++) {
      for (int j=0;j<3;j++) {
         System.out.println( input[i][j]+" ");
     } 
       System.out.println();
     }
     rotate(input, 2);
      for (int i=0; i<3; i++) {
      for (int j=0;j<3;j++) {
         System.out.println( input[i][j]+" ");
     } 
       System.out.println();
     }
}
}
