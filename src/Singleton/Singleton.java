package Singleton;

public class Singleton {
    private static Singleton uniqueInstance = null;

    private Singleton() {
        // Private constructor to prevent instantiation
    }
    public static Singleton getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        System.out.println("Singleton instance created" + uniqueInstance);
        return uniqueInstance;
    }
}
