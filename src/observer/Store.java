package observer;

import java.util.ArrayList;

public class Store implements Subject {

    private ArrayList<Observer> observers = new ArrayList<>();
    private int price;

    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        observers.remove(o);
        System.out.println("Observer removed : " + o);
    }

    @Override
    public void notifyObserver() {
        for (Observer o : observers) {
            o.update(price);
        }
    }

    public void setPrice(int price) {
        this.price = price;
        notifyObserver();
    }
}
