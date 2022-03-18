class One {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0, j = 0;
        while(i<matrix.length && j<matrix[0].length){
            if(matrix[i][j] == target){
                return true;
            }
            if(matrix[i][matrix[0].length-1]>=target){
                if(matrix[i][matrix[0].length-1]==target) return true;
                j++;
            }else{
                i++;
                j=0;
            }
        }
        return false;
    }
}