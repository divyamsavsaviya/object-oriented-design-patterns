package State;

public class NoCash implements ATMState {

    ATMMachine atmMachine;
    public NoCash(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("We don't have any money");
    }

    @Override
    public void ejectCard() {
        System.out.println("We don't have any money. You didn't enter a card");
    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("We don't have any money");
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("We don't have any money");
    }
}
