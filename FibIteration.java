public class FibIteration {
    public static void printPascalTriangle(int numRows) {
        for (int row = 0; row < numRows; row++) {
            int value = 1;
            for (int col = 0; col <= row; col++) {
                System.out.print(value + " ");
                value = value * (row - col) / (col + 1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int numRows = 8;
        printPascalTriangle(numRows);
    }
}
