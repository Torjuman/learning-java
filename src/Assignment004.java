import java.util.Scanner;
// Create a program to calculate installment amount for per month
public class Assignment004 {
  public static void main(String[] args) {

    try (Scanner input = new Scanner(System.in)) {
      int phonePrice = 1800; // 1800 euros
      int numberOfInstallment, installmentPerMonth;

      System.out.print("How many number of installments do you want? ");
      
      // get number of installments from user
      numberOfInstallment = input.nextInt();
     
      // calculate  installment amount for per month
      installmentPerMonth = phonePrice / numberOfInstallment;
    
        System.out.println("Monthly installment Amount: "+ installmentPerMonth + " euros");
    } 

  }
}