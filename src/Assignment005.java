import java.util.Scanner;
/*
 * valid voter program using if,else 
 * step 1: ask for a person age
 * step 2: if age is equal or more than 18 than print valid voter
 * step 3: else print invalid voter
 */

public class Assignment005 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int age;

    System.out.print("Enter your age : ");
    age = input.nextInt();
    input.close();

    if (age >= 18) {
        System.out.println("You are a valid voter !");
    }else{
        System.out.println("You are an invalid voter !");
    }
  }
}