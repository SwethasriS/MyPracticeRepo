import java.util.Scanner;

// Step 1: Document Interface
interface Document {
    void open();
}

// Step 2: Concrete Document Classes
class WordDocument implements Document {
    public void open() {
        System.out.println("📄 Opening a Word document (.docx)...");
    }
}

class PdfDocument implements Document {
    public void open() {
        System.out.println("📕 Opening a PDF document (.pdf)...");
    }
}

class ExcelDocument implements Document {
    public void open() {
        System.out.println("📊 Opening an Excel document (.xlsx)...");
    }
}

// Step 3: Abstract Factory
abstract class DocumentFactory {
    public abstract Document createDocument();
}

// Step 4: Concrete Factories
class WordFactory extends DocumentFactory {
    public Document createDocument() {
        return new WordDocument();
    }
}

class PdfFactory extends DocumentFactory {
    public Document createDocument() {
        return new PdfDocument();
    }
}

class ExcelFactory extends DocumentFactory {
    public Document createDocument() {
        return new ExcelDocument();
    }
}

// Step 5: Tester with User Input
public class FactoryTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("📁 Welcome to Swetha Sri's Smart Document Creator!");
        System.out.println("Please choose a document type to create:");
        System.out.println("1. Word Document");
        System.out.println("2. PDF Document");
        System.out.println("3. Excel Document");

        int choice = scanner.nextInt();
        DocumentFactory factory = null;

        switch (choice) {
            case 1:
                factory = new WordFactory();
                break;
            case 2:
                factory = new PdfFactory();
                break;
            case 3:
                factory = new ExcelFactory();
                break;
            default:
                System.out.println("⚠️ Invalid choice. Exiting.");
                scanner.close();
                return;
        }

        Document doc = factory.createDocument();
        doc.open();

        System.out.println("\n✨ Created by Swetha Sri - 6427409 ✨");
        scanner.close();
    }
}
