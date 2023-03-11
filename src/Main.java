import newPackage.NewClass;

// 1. `public class Main { public static void main(String[] args) {}`
// 2. (any class) `public static void main(String[] args) {}`
// 3. (no main method) not runnable
public class Main {
    public static void main(String[] args) {
        Main2.main(args);

        NewClass.methodName();
    }
}

class Main2 {
    public static void main(String[] args) {
        System.out.println("3Hello world!");
    }
}