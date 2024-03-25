package observer;

public class Customer implements Observer {

    private int price;
    private Subject store;
    private int id;
    private static int customerIDTracker = 0;

    public Customer(Subject store) {
        this.store = store;
        this.id = ++customerIDTracker;
        store.register(this);
        System.out.println("New customer added with id : " + this.id);
    }

    @Override
    public void update(int price) {
        this.price = price;
        System.out.println(this.id + " : Price changed to : " + price);
    }
}
