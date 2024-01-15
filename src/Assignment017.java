import java.util.Scanner;

// Create a pattern like following one if n=4
/*
 1
 1 0
 1 0 1
 1 0 1 0
 */

public class Assignment017 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a number : ");
            int n = input.nextInt(), row, col;
            input.close();

            for(row = 1; row <= n; row++) {
                int printValue = 1;
                for(col = 1; col <= row; col++) {
                    System.out.print(printValue + " ");
                    if (printValue == 1) {
                        printValue = 0;
                    } else {
                        printValue = 1;
                    }
                }
                System.out.println();
            }
        }
    }
  }
  