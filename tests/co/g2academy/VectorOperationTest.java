package co.g2academy;

import org.junit.Test;


import static org.junit.Assert.*;

public class VectorOperationTest {
        VectorOperation vector = new VectorOperation();

    //test hasil dari pertambahan vector yang benar
    @Test
    public void testVectorAdditionResult() {
        int[] vector1 = {1,2,3};
        int[] vector2 = {4,5,6};
        int[] action = vector.vectorAddition(vector1, vector2);
        assertNotNull(action);
        assertEquals(3,action.length);
        assertEquals(5 , action[0]);
        assertEquals(7 , action[1]);
        assertEquals(9 , action[2]);
    }

    //test hasil dari pertambahan vector yang memiliki perbedaan panjang
    @Test
    public void testVectorAdditionalDifferentLength() {
        int[] vector1 = {1,2};
        int[] vector2 = {1,2,3};
        int[] action = vector.vectorAddition(vector1, vector2);
       assertNull(action);
    }

    //test hasil dari pertambahan vector dimana vektor tidak terdapat data apapun
    @Test
    public void testVectorAdditionalNullALLVector() {
        int[] vector1 = {};
        int[] vector2 = {};
        int[] action = vector.vectorAddition(vector1, vector2);
        assertNull(action);
    }

    //test hasil dari perkalian vector yang benar
    @Test
    public void testVectorMultiplicationResult() {
        int[] vector1 = {1,2,3};
        int[] vector2 = {3,4,5};
        int[] action = vector.vectorMultiplication(vector1, vector2);
        assertNotNull(action);
        assertEquals(3, action.length);
        assertEquals(3, action[0]);
        assertEquals(8, action[1]);
        assertEquals(15, action[2]);
    }

    //test hasil dari perkalian vector yang memiliki panjang yang berbeda
    @Test
    public void testVectorMultiplicationDifferentLength() {
        int[] vector1 = {1,2};
        int[] vector2 = {1,2,3,4};
        int[] action = vector.vectorMultiplication(vector1, vector2);
        assertNull(action);
    }

    //test hasil dari perkalian vector dimana vektor tidak memiliki data apapun
    @Test
    public void testVectorMultiplicationNullAll() {
        int[] vector1 = {};
        int[] vector2 = {};
        int[] action = vector.vectorMultiplication(vector1, vector2);
        assertNull(action);
    }

    //test hasil dari perkalian vector dimana salah satu vektor tidak memiliki data apapun
    @Test
    public void testVectorMultiplicationNull() {
        int[] vector1 = {1,2,3};
        int[] vector2 = {};
        int[] action = vector.vectorMultiplication(vector1, vector2);
        assertNull(action);
    }
}