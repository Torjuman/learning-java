import java.util.Scanner;
// Logical or assignment
// step 1: Print "Do you love java? "
// step 2: take user input y / Y / n / N
// step 3: if user input y / Y then print you are a java lover
// step 4: if user input n / N then print you are not a java lover

public class Assignment007 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    char ch;

    System.out.println("Do you love java ?");
    System.out.print("If yes write y or if no write n : ");
    ch = input.next().charAt(0);
    input.close();

    if (ch == 'y' || ch == 'Y') {
        System.out.println("You are a java lover");
    }else{
        System.out.println("You are not a java lover");
    }
  }
}