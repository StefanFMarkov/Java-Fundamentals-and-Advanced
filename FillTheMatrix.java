import java.util.Scanner;

public class FillTheMatrix {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(", ");

        int size = Integer.parseInt(input[0]);

        String pattern = input[1];

        int[][] matrix = new int[size][size];

        int counter = 1;

        if (pattern.equals("A")) {

            for (int col = 0; col < matrix[0].length; col++) {
                for (int row = 0; row < matrix.length; row++) {
                    matrix[row][col] = counter++;
                }
            }


        } else {
            for (int col = 0; col < matrix[0].length; col++) {
                if (col % 2 == 0) {
                    for (int row = 0; row < matrix.length; row++) {
                        matrix[row][col] = counter++;
                    }
                } else {
                    for (int row = matrix.length - 1; row >= 0; row--) {
                        matrix[row][col] = counter++;
                    }
                }
            }
        }
        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
