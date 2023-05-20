import java.util.HashMap;
import java.util.Map;

public class FibMemoization {
    private static Map<String, Integer> memo = new HashMap<>();

    public static int getPascalValue(int row, int col) {
        if (col == 0 || col == row) {
            return 1;
        }

        String key = row + "-" + col;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        int value = getPascalValue(row - 1, col - 1) + getPascalValue(row - 1, col);
        memo.put(key, value);
        return value;
    }

    public static void printPascalTriangle(int numRows) {
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print(getPascalValue(row, col) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int numRows = 5;
        printPascalTriangle(numRows);
    }
}
