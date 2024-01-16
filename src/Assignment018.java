import java.util.Scanner;

/*
 * Assigment 18 (Print the day name)
 * declare an array of weekdays 
 * User will give a day number you have to print the equivalent day name
 * 
 * Example 1
 * input-> Enter day number (1-7) : 1
 * output-> Saturday
 * 
 * Example 2
 * input-> Enter day number (1-7) : 3
 * output-> Monday
 */

public class Assignment018 {
  public static void main(String[] args) {

       try (Scanner input = new Scanner(System.in)) {
        String[] weekdays = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        System.out.print("Enter day number (1-7) : ");
        int n = input.nextInt();
        input.close();

        for(int i = 1; i <= weekdays.length; i++) {
            if (i == n) {
                System.out.println("Your day is : " + weekdays[i - 1]);
                break;
            }
        }
      }
  }
}
