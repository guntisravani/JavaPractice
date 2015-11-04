//Algorithms such that if an element in an M*N matrix is 0, set its entire row and column to 0  
public class ReplaceRowCol {
  public static void replaceRowCol(int[][] matrix) {
  boolean[] row = new boolean[matrix.length];
  boolean[] col = new boolean[matrix[0].length];
  
  //store the row and col index with value 0
  for(int i = 0; i < matrix.length; i++) {
    for(int j = 0;j < matrix[0].length; j++) {
      if(matrix[i][j] == 0) {
        row[i] = true;
        col[j] = true;
      }
    }
  }
// nullify rows
for(int i = 0; i < row.length; i++) {
  if(row[i]) {
    nullifyRow(matrix,i);
  }
}
//nullify column
for(int j = 0; j < col.length; j++) {
  if(col[j]) {
    nullifyCol(matrix, j);
  }
}
  }
public static void nullifyRow(int[][] matrix, int row) {
  for(int j = 0; j < matrix[0].length; j++) {
    matrix[row][j] = 0;
  }
}
public static void nullifyCol(int[][] matrix, int col) {
  for(int i = 0; i < matrix.length; i++) {
    matrix[i][col] = 0;
  }
}
  
public static void main(String[] args) {
     int[][] input = {{10,20,0},{40,50,60},{70,80,90}};
     for (int i=0; i<3; i++) {
      for (int j=0;j<3;j++) {
         System.out.println( input[i][j]+" ");
     } 
       System.out.println();
     }
     replaceRowCol(input);
      for (int i=0; i<3; i++) {
      for (int j=0;j<3;j++) {
         System.out.println( input[i][j]+" ");
     } 
       System.out.println();
     }
}
}