import java.util.Scanner;
/*
 * Digit spelling program using if,else if, else
 * step 1: ask for a digit between 0-9
 * step 2: check the digit and print it by spelling. example if user input is 0 then print Zero
 * step 3: if the digit is not among 0-9 then print Invalid digit
 */
public class Assignment006 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num;

    System.out.print("Enter any number between 0 to 9 : ");
    num = input.nextInt();
    input.close();

    if (num == 0) {
        System.out.println("You have entered Zero !");
    }else if (num == 1) {
        System.out.println("You have entered One !");
    }else if (num == 2) {
        System.out.println("You have entered Two !");
    }else if (num == 3) {
        System.out.println("You have entered Three !");
    }else if (num == 4) {
        System.out.println("You have entered Four !");
    }else if (num == 5) {
        System.out.println("You have entered Five !");
    }else if (num == 6) {
        System.out.println("You have entered Six !");
    }else if (num == 7) {
        System.out.println("You have entered Seven !");
    }else if (num == 8) {
        System.out.println("You have entered Eight !");
    }else if (num == 9) {
        System.out.println("You have entered Nine !");
    }
  }
}