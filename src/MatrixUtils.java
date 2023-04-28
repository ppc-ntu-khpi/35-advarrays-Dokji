import java.util.Arrays;
import java.util.function.IntFunction;

public class MatrixUtils {
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

