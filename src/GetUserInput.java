import java.util.Scanner;

public class GetUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int age;

        System.out.print("Enter your name : ");
        name = input.nextLine();
        System.out.print("Enter your age : ");
        age = input.nextInt();
        input.close();

        System.out.println("Welcome " + name + " and your age is " + age);
    }
}
