import java.util.Scanner;

// 1. generate and print palindrome numbers from m-n 
// 2. count and print number of palindrome numbers

public class Assignment014 {
   public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("Start number: ");
      int m = input.nextInt();

      System.out.print("End number: ");
      int n = input.nextInt();
      input.close();

      int totalPalindromeNumber = 0, i;

      if ((m >= 0 && m <= 9) || (n >= 0 && n <= 9)) {
        System.out.println("Please enter minimum two digits");
      } else {
        for(i = m; i <= n; i++) {
        
          int temp = i, r = 0, sum = 0;
          
          while (temp != 0) {
            r = temp % 10;
            sum = sum * 10 + r;
            temp = temp / 10;
          }
  
          if (sum == i) {
            System.out.println("Palindrome " + sum);
            totalPalindromeNumber = totalPalindromeNumber + 1;
          }
        }
  
       System.out.println("Total Palindrome numbers : "+totalPalindromeNumber);
      }
    }
  }
}
