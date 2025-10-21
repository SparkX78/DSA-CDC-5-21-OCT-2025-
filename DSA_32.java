public class DSA_32 {
    public static void rotate(int[][] matrix){
        int n = matrix.length;
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n -1- j];
                matrix[i][n-1-j] = temp;
            }
        }
    }
    public static void main(String args[]){
        int[][] matrix = { {23, 11, 10},
                            {9, 12, 18},
                            {22, 87, 25}};
        rotate(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        System.out.println(); 
        }

    }
}
