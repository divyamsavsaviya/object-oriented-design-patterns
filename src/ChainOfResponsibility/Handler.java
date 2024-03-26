package ChainOfResponsibility;

public interface Handler {
    public void setNext(Handler handler);
    public void handleRequest(String request);
}