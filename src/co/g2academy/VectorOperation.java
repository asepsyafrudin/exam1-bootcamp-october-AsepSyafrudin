package co.g2academy;

public class VectorOperation {

    public int[] vectorAddition(int[] vector1, int[] vector2) {
        int lengthVector1 = vector1.length;
        int lengthVector2 = vector2.length;
        int[] result = null;

        if(lengthVector1 !=0 && lengthVector2!=0) {
            if(lengthVector1 == lengthVector2 ) {
                result = new int[lengthVector1];
                for(int i = 0 ; i<lengthVector1; i++) {
                    result[i] = vector1[i] + vector2[i];
                }
            }
        }

        return result;
    }


    public int[] vectorMultiplication(int[] vector1, int[] vector2) {
        int lengthVector1 = vector1.length;
        int lengthVector2 = vector2.length;
        int [] result = null;

        if(lengthVector1 !=0 && lengthVector2!=0){
            if(lengthVector1 == lengthVector2){
                result = new int [vector1.length];
                for(int i = 0 ; i<lengthVector1 ;  i++) {
                    result[i] = vector1[i]*vector2[i];
                }
            }
        }

        return  result;
    }
}
