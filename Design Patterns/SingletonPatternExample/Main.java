public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("Hello from logger1");

        Logger logger2 = Logger.getInstance();
        logger2.log("Hello from logger2");

        if (logger1 == logger2) {
            System.out.println("Both loggers are the same instance.Singleton works!");
        } else {
            System.out.println("Different instances exist.Singleton failed!");
        }
    }
}
