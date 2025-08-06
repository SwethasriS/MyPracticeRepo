// SearchDemo.java
import java.util.Arrays;
import java.util.Scanner;

public class SearchDemo {

    // Linear Search by Product Name
    public static Product linearSearchByName(Product[] products, String name) {
        for (Product p : products) {
            if (p.productName.equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    // Binary Search by Product Name (sorted list)
    public static Product binarySearchByName(Product[] products, String name) {
        int left = 0, right = products.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = name.compareToIgnoreCase(products[mid].productName);
            if (cmp == 0) return products[mid];
            if (cmp < 0) right = mid - 1;
            else left = mid + 1;
        }
        return null;
    }

    // Search by Category
    public static void searchByCategory(Product[] products, String category) {
        boolean found = false;
        for (Product p : products) {
            if (p.category.equalsIgnoreCase(category)) {
                System.out.println("📦 " + p);
                found = true;
            }
        }
        if (!found) {
            System.out.println("❌ No products found in category: " + category);
        }
    }

    // Sort by Product Name
    public static void sortByProductName(Product[] products) {
        Arrays.sort(products, (a, b) -> a.productName.compareToIgnoreCase(b.productName));
    }

    // Show All Products
    public static void showAllProducts(Product[] products) {
        System.out.println("🛍️ Available Products:");
        for (Product p : products) {
            System.out.println(" - " + p);
        }
        System.out.println();
    }

    // Main Method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Product[] products = {
            new Product(101, "Shoes", "Footwear"),
            new Product(102, "Phone", "Electronics"),
            new Product(103, "T-shirt", "Clothing"),
            new Product(104, "Laptop", "Electronics"),
            new Product(105, "Socks", "Footwear"),
            new Product(106, "Camera", "Electronics")
        };

        showAllProducts(products);

        System.out.println("🔍 Enter product name to search (Linear Search):");
        String nameInput = scanner.nextLine();
        Product foundLinear = linearSearchByName(products, nameInput);
        System.out.println(foundLinear != null ? "✅ Found: " + foundLinear : "❌ Product not found");

        System.out.println("\n🔍 Enter product name to search (Binary Search):");
        sortByProductName(products); // Required before binary search
        String binaryInput = scanner.nextLine();
        Product foundBinary = binarySearchByName(products, binaryInput);
        System.out.println(foundBinary != null ? "✅ Found: " + foundBinary : "❌ Product not found");

        System.out.println("\n🔎 Enter category to list products:");
        String categoryInput = scanner.nextLine();
        searchByCategory(products, categoryInput);

        System.out.println("\n👩‍💻 Created by Swetha Sri – 6427409");
    }
}
