import java.util.*;
public class DSA_31 {
    
    public static int[] rowAndMaximumOnes(int[][] mat) {
        int maxCount = 0;
        int rowIndex = 0;
        for(int i = 0; i < mat.length; i++){
            int count = 0;
            for(int num : mat[i]){
                if(num == 1){
                    count++;
                }
            }
            if(count > maxCount){
                maxCount = count;
                rowIndex = i;
            }
        }
        return new int[]{rowIndex, maxCount};
        
    }
    public static void main(String args[]){
        int[][] mat = {{0,1,0,1}, {0,0,0,0}, {0,0,1,1,1}};
        int[] result = rowAndMaximumOnes(mat);
        System.out.println(Arrays.toString(result));
    }
}

