package Singleton;

public class Client {

    private static Singleton singleton;

    public static void main(String[] args) {
        // access the singleton instance through the getInstance() method
        singleton = Singleton.getUniqueInstance();
    }
}
