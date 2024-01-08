import java.util.Scanner;
/*
 * Assignment-3 (User Input)
 * step 1: create a class called Product
 * step 2: create a main method
 * step 3: declare variables: id, title, price, description, category
 * step 4: get user input for each variables
* step 5: print the variables
 */

public class Assignment003 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Add your product");
        System.out.print("Product Title : ");
        String productTitle = input.nextLine();

        System.out.print("Product Category : ");
        String productCategory = input.nextLine();

        System.out.print("Product Description : ");
        String productDescription = input.nextLine();

        System.out.print("Product Price(Taka in Number) : ");
        int productPrice = input.nextInt();

        System.out.print("Product ID(in Number) : ");
        int productID = input.nextInt();

        input.close();

        System.out.println();
        System.out.println("Your Product is listed");
        System.out.println("Product : " + productTitle);
        System.out.println("ID : " + productID);
        System.out.println("Price : " + productPrice + " Taka");
        System.out.println("Description : " + productDescription);
        System.out.println("Category : " + productCategory);
    }
}
