package newPackage;

public class NewClass {
    public static void methodName() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {}
        nextMethod();
    }

    static void nextMethod() {
        System.out.println("4");
        System.out.println("5");
    }

    public static void main(String[] args) {
        methodName();
    }
}

