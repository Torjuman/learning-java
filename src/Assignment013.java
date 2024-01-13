import java.util.Scanner;

// find nth fibonacci number
// example : 0 1 1 2 3 5 8 13 21 .....

public class Assignment013 {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {

      System.out.print("which fibonacci number you want to see? => ");
      int n = input.nextInt(), i, fisrtNum = 0, secondNum = 1, fibo = 0;
      input.close();

        for(i = 3; i <= n; i++) {
            fibo = fisrtNum + secondNum;
            fisrtNum = secondNum;
            secondNum = fibo;
        }
        System.out.println("Your fibonacci number is " + fibo);
    }
  }
}
 