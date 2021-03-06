package co.g2academy;

import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixOperationTest {
    MatrixOperation matrix = new MatrixOperation();

    //test hasil dari pertambahan Matrix yang benar
    @Test
    public void testAdditionMatrixResult() {
        int[][] array1= {
                {1,2},
                {5,7},
        };

        int[][] array2 = {
                {10,11},
                {7,4},
        };

        int[][] action = matrix.matrixAdditional(array1, array2);
        assertNotNull(action);
        assertEquals(11, action[0][0]);
        assertEquals(13, action[0][1]);
        assertEquals(12, action[1][0]);
        assertEquals(11, action[1][1]);
    }

    //test hasil dari pertambahan Matrix jika matrix nya tidak ada data
    @Test
    public void testAdditionMatrixAllNull() {
        int[][] array1= {};

        int[][] array2 = {};
        int[][] action = matrix.matrixAdditional(array1, array2);
        assertNull(action);
    }

    //test hasil dari pertambahan Matrix jika  matrix memiliki jumlah baris atay jumlah kolom berbeda
    @Test
    public void testAdditionalMatrixDifferentLength() {
        int[][] matrix1= {
                {1,2,3},
                {2,3,1}
        };

        int[][] matrix2 = {
                {1,2},
                {2,1}
        };
        int[][] action = matrix.matrixAdditional(matrix1, matrix2);
        assertNull(action);
    }

    //test hasil dari perkalian Matrix yang benar
    @Test
    public void testMultiplicationMatrixResult() {
        int[][] matrix1 = {
                {1,2},
                {2,1}
        };

        int[][] matrix2 = {
                {2,2},
                {3,3}
        };

        int[][] action = matrix.matrixMultiplication(matrix1, matrix2);

        assertNotNull(action);
        assertEquals(8 , action[0][0]);
        assertEquals(8 , action[0][1]);
        assertEquals(7 , action[1][0]);
        assertEquals(7 , action[1][1]);

    }

    //test hasil dari perkalian Matrix jika matrix tidak mempunyai data
    @Test
    public void testMultiplicityNullMatrix() {
        int[][] matrix1 = {
        };

        int[][] matrix2 = {
        };

        int[][] action = matrix.matrixMultiplication(matrix1, matrix2);
        assertNull(action);
        
    }

    //test hasil dari perkalian Matrix jika memiliki perbedaan baris atau kolom tetapi masih memenuhi kaidah perkalian matrix
    @Test
    public void testMultiplicationDifferentRowButCanPairing() {
        int[][] matrix1 = {
                {1,2},
                {2,1},
                {3,1}
        };

        int[][] matrix2 = {
                {2,2},
                {3,3}
        };

        int[][] action = matrix.matrixMultiplication(matrix1, matrix2);
        assertNotNull(action);
        assertEquals(8 , action[0][0]);
        assertEquals(8 , action[0][1]);
        assertEquals(7 , action[1][0]);
        assertEquals(7 , action[1][1]);
        assertEquals(9 , action[2][0]);
        assertEquals(9 , action[2][1]);
    }

    //test hasil dari perkalian Matrix jika memiliki perbedaan baris atau kolom tetapi tidak memenuhi kaidah perkalian matrix
    @Test
    public void testMultiplicationDifferentRowButCanNotPairing() {
        int[][] matrix1 = {
                {1,2},
                {2,1},

        };

        int[][] matrix2 = {
                {2,2},
                {3,3},
                {3,3}
        };

        int[][] action = matrix.matrixMultiplication(matrix1, matrix2);
        assertNull(action);
    }
}
