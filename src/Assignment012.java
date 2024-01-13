import java.util.Scanner;
// print sum of odd numbers from m-n

public class Assignment012 {
    public static void main(String[] args) {
        int i,m,n, sum = 0;
      Scanner input = new Scanner(System.in);
      System.out.println("Calculation of ood number.");
      System.out.print("Enter your first number : ");
      m = input.nextInt();
      System.out.print("Enter your second number : ");
      n = input.nextInt();
      input.close();

      for(i = m; i <= n; i++) {
        if (i % 2 == 1) {
            sum += i;
        }
      }
      System.out.println("Sum of odd number is " + sum);
    }
  }