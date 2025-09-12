class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] matrix = new int[arr1.length][arr2[0].length];
        
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2[0].length; j++){
                int tmp = 0;
                for(int t=0; t<arr2.length; t++){
                    tmp += arr1[i][t] * arr2[t][j];
                }
                matrix[i][j] = tmp;
            }
        }
        return matrix;
    }
}