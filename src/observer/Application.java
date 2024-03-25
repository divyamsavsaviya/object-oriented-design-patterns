package observer;

public class Application {
    public static void main(String[] args) {
        Store store = new Store();
        Customer customer1 = new Customer(store);
        Customer customer2 = new Customer(store);
        Customer customer3 = new Customer(store);
        store.setPrice(100);
        store.setPrice(200);
        store.setPrice(300);
    }
}
