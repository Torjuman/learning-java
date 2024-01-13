import java.util.Scanner;

// switch assignment: call center
// if user select option 1 then set language bengali
// if user select option 2 then set language hindi
// if user select option 3 then set language urdu
// for any other option set language english

public class Assignment009 {
    public static void main(String[] args) {
      // get the OPTION from user
      Scanner input = new Scanner(System.in);

      System.out.print("Enter 1 to select Bengali, 2 to select Hindi, 3 to select Urdu, or any number to select English : ");
        int digit = input.nextInt();
        input.close();

      // use switch, case, break and default
      switch (digit) {
        case 1:
            System.out.println("Selected language is Bengali");
            break;
        case 2:
            System.out.println("Selected language is Hindi");
            break;
        case 3:
            System.out.println("Selected language is Urdu");
            break;
        default:
            System.out.println("Selected language is English");
            break;
      }
    }
  }