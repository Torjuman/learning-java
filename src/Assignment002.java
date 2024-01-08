/*
 * Assignment-2 (Variable and Data type)
 * step 1: create a class called Product
 * step 2: create a main method
 * step 3: declare variables: id, title, price, description, category
 * step 4: assign the following data in main method
101,iphone15,1895 euros,perfect product with best image quality, phone,
* step 5: print the data
 */
public class Assignment002 { 
    public static void main(String[] args) {
        int productID = 101;
        String productTitle = "iPhone 15";
        String productPrice = "1895 euros";
        String productDescription = "perfect product with best image quality";
        String productCategory = "phone";
        
        System.out.println("Product Name : " + productTitle);
        System.out.println("ID : " + productID);
        System.out.println("Price : " + productPrice);
        System.out.println("Description : " + productDescription);
        System.out.println("Category : " + productCategory);
    }
}
