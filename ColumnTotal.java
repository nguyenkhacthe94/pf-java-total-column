import java.util.Scanner;

public class ColumnTotal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int column, row;
        do {
            System.out.print("Enter amount of column: ");
            column = input.nextInt();
            if (column < 1 || column > 10) System.out.println("\n Column should not exceed 10");
        } while (column < 1 || column > 10);
        do {
            System.out.print("Enter amount of row: ");
            row = input.nextInt();
            if (row < 1 || row > 10) System.out.println("\n Row should not exceed 10");
        } while (row < 1 || row > 10);
        float array[][] = new float[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Enter matrix number at " + i + ", " + j + ": ");
                array[i][j] = input.nextFloat();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        int del;
        do {
            System.out.print("\n Enter column to get sum: ");
            del = input.nextInt();
            if (del < 0 || del >= column) System.out.println("Entered wrong column");
        } while (del < 0 || del >= column);
        float sum = 0;
        for (int i = 0; i < row; i++) {
            sum += array[i][del];
        }
        System.out.println("Total numbers of column " + del + " is: " + sum);
    }
}