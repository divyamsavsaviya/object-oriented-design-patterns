package ChainOfResponsibility;

public class ConcreteHandler1 implements Handler {

    Handler successor;
    @Override
    public void setNext(Handler handler) {
        this.successor = handler;
    }

    @Override
    public void handleRequest(String request) {
        if (request.equals("R1")) {
            System.out.println("Handling request R1 in ConcreteHandler1");
        } else {
            System.out.println("ConcreteHandler1 doesn't handle this request");
            successor.handleRequest(request);
        }
    }
}