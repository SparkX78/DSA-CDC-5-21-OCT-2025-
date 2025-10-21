public class DSA_29 {
    
    public static boolean searchMatrix(int[][] matrix, int target) {
        int top = 0;
        int bottom = matrix.length -1;
        int left = 0; 
        int right = matrix[0].length -1;

        while(top <= bottom && left <= right){
            for(int i = left; i <= right; i++){
                if(matrix[top][i] == target){
                    return true;
                }
                
            }
            top++;
            if(top <= bottom && left <= right ){
                for(int i = top; i <= bottom; i++){
                    if(matrix[i][right] == target){
                        return true;
                    }
                }
                right--;
                
            }
            

            
            if(top <= bottom && left <= right ){

                for(int i = right; i >= left; i--){
                    if(matrix[bottom][i] == target){
                        return true;
                    }
                
                }
                bottom--;

            }

            if(top <= bottom && left <= right ){

                for(int i = bottom; i >= top; i--){
                    if(matrix[i][left] == target){
                        return true;
                    }
                
                }
                left++;

            }
            
        }
        return false;        
    }
    public static void main(String args[]){
        int[][] matrix = { {21, 13, 33, 15},
                            {22, 12, 87, 10},
                            {16, 19, 98, 12}};
        int target = 100;
        System.out.println(searchMatrix(matrix, target));
    }
}

