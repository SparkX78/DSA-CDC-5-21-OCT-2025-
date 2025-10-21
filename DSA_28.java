import java.util.*;
public class DSA_28 {
    public static List<Integer> matrixSolve(int[][] matrix){
        List<Integer> result = new ArrayList();
        int top = 0;
        int bottom = matrix.length -1;
        int left = 0;
        int right = matrix[0].length - 1;
        while(top <= bottom && left <= right){
            // left ---> right
            for(int i = left; i <= right; i++){
                result.add(matrix[top][i]);
            }
            top++;

            // top --> bottom
            for(int i = top; i<= bottom; i++){
                result.add(matrix[i][right]);
            }
            right--;

            // right --> bottom
            for(int i = right; i >= left; i--){
                result.add(matrix[bottom][i]);
            }
            bottom--;

            // bottom --> top
            for(int i = bottom; i>= top; i--){
                result.add(matrix[i][left]);
            }
            left++;
        }
        return result;
    }
    public static void main(String args[]){
        int[][] matrix = {    {20, 12, 54},
                              {21, 15, 20},
                              {89, 45, 99}
                        };
        List<Integer> result = matrixSolve(matrix);
        System.out.println(result);
        
                            
        
    }
}
