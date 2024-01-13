import java.util.Scanner;

// find factorial of n

public class Assignment011 {
    public static void main(String[] args) {
        int userInputNum, i, factorial = 1;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number to its factorial number : ");
      userInputNum = input.nextInt();
      input.close();

      for(i = 1; i <= userInputNum; i++) {
        factorial = factorial * i;
      }

      System.out.println("Factorial of your entered number : " + factorial);
    }
  }