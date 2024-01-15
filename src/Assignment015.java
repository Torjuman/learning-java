import java.util.Scanner;

// 1. generate and print armstrong numbers from m-n 
// 2. count and print number of armstrong numbers

public class Assignment015 {
   public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("Start number: ");
      int m = input.nextInt();

      System.out.print("End number: ");
      int n = input.nextInt();
      input.close();
      
      int totalArmstrongNumber=0, i;

      for(i = m; i <= n; i++) {
        int r, sum = 0, temp = i;

        while (temp != 0) {
            r = temp % 10;
            sum = sum + (r * r * r);
            temp = temp / 10;
        }

        if (sum == i) {
            System.out.println("Armstrong number " + sum);
            totalArmstrongNumber++;
        }
      }
    
     System.out.println("Total armstrong numbers : " + totalArmstrongNumber);
    }
  }
}
