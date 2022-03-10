import java.util.*;
class One {
    public void setZeroes(int[][] matrix) {
        // Set<Integer> row = new HashSet<>();
        // Set<Integer> column = new HashSet<>();
        // for(int i = 0; i<matrix.length;i++){
        //     for(int j = 0;j<matrix[i].length;j++){
        //         if(matrix[i][j] ==0){
        //             row.add(i);
        //             column.add(j);
        //         }
        //     }
        // }
        // for(int i = 0; i<matrix.length;i++){
        //     for(int j=0;j<matrix[i].length;j++){
        //         if(row.contains(i) || column.contains(j)){
        //             matrix[i][j] = 0;
        //         }
        //     }
        // }
        int n = matrix.length;
        int m = matrix[0].length;
        
        boolean firstRow = false, firstColumn = false;
        
        for(int i = 0;i<n;i++){
            if(matrix[i][0] == 0) {
                firstColumn=true;
                break;
            }
        }
        
        for(int i = 0; i<m; i++){
            if(matrix[0][i]==0) {
                firstRow = true;
                break;
            }
        }
        
        for(int i = 1; i<n; i++){
            for(int j =1;j<m;j++){
                if(matrix[i][j]==0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        
        for(int i = 1; i<n; i++){
            for(int j = 1;j<m ; j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j] = 0;
                }
            }
        }
        
        if(firstColumn){
            for(int i = 0; i<n; i++){
                matrix[i][0] = 0;
            }
        }
        
        if(firstRow){
            for(int i = 0;i<m; i++){
                matrix[0][i] = 0;
            }
        }
    }
}