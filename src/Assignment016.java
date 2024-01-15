import java.util.Scanner;

// validate user based on username and password
// input username and password until username=="anis" and password=="123456"
// if username and password does not match print "username/password is incorrect. Please try again"
// if username and password does not match print "welcome to the system"

public class Assignment016 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            String usernameBase = "Torjuman Rimon", usernameFromUser, passwordBase = "123456", passwordFromUser;

            while (true) {
                
                System.out.print("Enter username : ");
                usernameFromUser = input.nextLine();
    
                System.out.print("Enter password : ");
                passwordFromUser = input.nextLine();
    
                if (usernameBase.equals(usernameFromUser) && passwordBase.equals(passwordFromUser)) {
                    System.out.println("welcome to the system");
                    break;
                }else{
                    System.out.println("username/password is incorrect. Please try again");
                }
            }
            input.close();
        }
    }
}
