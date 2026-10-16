package app;

public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        logger1.logSomething("first");
        logger2.logSomething("second");
        System.out.println(logger1 == logger2);
    }
}
