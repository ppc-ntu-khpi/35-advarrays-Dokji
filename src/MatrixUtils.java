import java.util.Arrays;
import java.util.function.IntFunction;


 /**
 * The class Matrix utils
 */ 
public class MatrixUtils {

/** 
 *
 * Sum
 *
 * @param matrix1  the matrix1. 
 * @param matrix2  the matrix2. 
 * @return int[][]
 */
    public static int[][] sum(int[][] matrix1, int[][] matrix2) { 

        int n = matrix1.length;
        int m = matrix1[0].length;
        int[][] result = new int[n][m];
        
        IntFunction<int[]> rowCreator = i -> new int[m];
        int[][] temp = new int[n][];
        Arrays.parallelSetAll(temp, rowCreator);
        
        IntFunction<int[]> rowCalculator = i -> {
            int[] row = temp[i];
            Arrays.setAll(row, j -> matrix1[i][j] + matrix2[i][j]);
            return row;
        };
        Arrays.parallelSetAll(result, rowCalculator);
        
        return result;
    }
}


