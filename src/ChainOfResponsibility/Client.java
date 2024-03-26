package ChainOfResponsibility;

public class Client {
    public static void main(String[] args) {
        Handler h1 = new ConcreteHandler1();
        Handler h2 = new ConcreteHandler2();
        h1.setNext(h2);
        h2.setNext(h1);
        h2.handleRequest("R1");
    }
}