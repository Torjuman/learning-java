// Logical AND assignment
// Check eligible candidate
// Step 1: Ask the candidate have you completed your masters? y/n 
// Step 2: Ask the candidate are you fulent in English? y/n 
// Step 3: if the candidate has passed masters and also have fluent english skill then print you are eligible for the job interview
// Step 4: else print Sorry. you are not eligible for the job interview

import java.util.Scanner;

public class Assignment008 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Have you completed your masters? If yes write y, if no write n : ");
    char mastersQn = input.next().charAt(0);
    System.out.print("Are you fulent in English? If yes write y, if no write n : ");
    char englishQn = input.next().charAt(0);
    input.close();

    if ((mastersQn == 'y' || mastersQn == 'Y') && (englishQn == 'y' || englishQn == 'Y')) {
        System.out.println("You are eligible for the job interview");
    }else{
        System.out.println("Sorry, you are not eligible for the job interview");
    }
  }
}