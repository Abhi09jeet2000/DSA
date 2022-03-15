class One {
   
    public void rotate(int[][] matrix) {
        for(int i = 0; i< matrix.length; i++){
            for(int j = 0; j<=i; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        int first = 0, last = matrix[0].length-1;
        while(first<last){
            for(int i = 0; i< matrix.length; i++){
                int temp = matrix[i][first];
                matrix[i][first] = matrix[i][last];
                matrix[i][last] = temp;
            }
            first++;
            last--;
        }
    }
}