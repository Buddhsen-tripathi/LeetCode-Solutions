class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> row = new HashSet<>();
        HashSet<Integer> col = new HashSet<>();
        for(int i=0; i<matrix[0].length; i++){
            for(int j=0; j<matrix.length; j++){
                if(matrix[j][i] == 0) {
                    col.add(i);
                    break;
                }
            }
        }
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == 0) {
                    row.add(i);
                    break;
                }
            }
        }
        for (int ele : row) {
            for(int j=0; j<matrix[0].length; j++){
                matrix[ele][j] = 0;
            }
        }
        for (int ele : col) {
            for(int j=0; j<matrix.length; j++){
                matrix[j][ele] = 0;
            }
        }
    }
}