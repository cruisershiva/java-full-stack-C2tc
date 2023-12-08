import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    private List<String> productList;

    public ProductManager() {
        this.productList = new ArrayList<>();
    }

    public List<String> getProductList() {
        return Collections.unmodifiableList(productList);
    }

    public void addProduct(String product) {
        productList.add(product);
    }

    public void displayProducts() {
        Collections.sort(productList);
        System.out.println(productList);
    }

    public void exitProgram() {
        System.exit(0);
    }

    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Product");
            System.out.println("2. Display Products");
            System.out.println("3. Exit");
            System.out.println("Enter your choice:");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter your product:");
                    String product = scanner.next();
                    productManager.addProduct(product);
                    break;
                case 2:
                    productManager.displayProducts();
                    break;
                case 3:
                    System.out.println("thank you for using our application");
                    productManager.exitProgram();
                    break;
                default:
                    System.out.println("This is the default case");
                    break;
            }
        }
    }
}
