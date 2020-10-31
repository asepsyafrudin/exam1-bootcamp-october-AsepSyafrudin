package co.g2academy;

public class MatrixOperation {
    public int[][] matrixAdditional(int[][] array1, int[][] array2) {
        int row1 = array1.length;
        int row2 = array2.length;
        int[][] result = null;
        if (row1!=0 && row2!=0) {
            int col1 = array1[0].length;
            int col2 = array2[0].length;
            result = new int[row1][col2];
            if(row1 == row2 && col1 == col2) {
                for(int i = 0 ; i<row1; i++) {
                    for(int j = 0 ; j<col1; j++) {
                        result[i][j] = array1[i][j] + array2[i][j];
                    }
                }
            }
        }

        return  result;
    }


    public int[][] matrixMultiplicity(int[][] matrix1, int[][] matrix2) {
        int row1 = matrix1.length;
        int row2 = matrix2.length;
        int[][] result = null;

        if(row1 !=0 && row2 !=0) {
            int col1 = matrix1[0].length;
            int col2 = matrix2[0].length;
            if (col1 == row2) {
                result = new int [row1][col2];
                int temp;
                for (int i = 0; i < row1; i++) {
                    for (int j = 0; j < col2; j++) {
                        temp = 0;
                        for (int k = 0; k < col1; k++) {
                            temp+= matrix1[i][k] * matrix2[k][j];
                        }
                        result[i][j] = temp;
                    }
                }
            }
        }

        return result;
    }
}
