import java.util.Arrays;


 /**
 * The class Matrix utils test
 */ 
public class MatrixUtilsTest {

/** 
 *
 * Main
 *
 * @param args  the args. 
 */
    public static void main(String[] args) { 

        int[][] matrix1 = {{14, 65, 43}, {42, 12, 16}, {27, 2, 3}};
        int[][] matrix2 = {{19, 28, 27}, {36, 15, 24}, {43, 32, 21}};

        int[][] result = MatrixUtils.sum(matrix1, matrix2);
        System.out.println("Matrix1:");
        for (int[] row : matrix1){
        System.out.println(Arrays.toString(row));}
        System.out.println("Matrix2:");
        for (int[] row : matrix2){
        System.out.println(Arrays.toString(row));}
        System.out.println("Matrix1+Matrix2:");
        for (int[] row : result) {
            
            System.out.println(Arrays.toString(row));
        }
    }
}