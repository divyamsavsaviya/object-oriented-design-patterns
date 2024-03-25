package State;

public class NoCard implements ATMState {

    ATMMachine atmMachine;
    public NoCard(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Please enter your pin");
        atmMachine.setATMState(atmMachine.getYesCardState());
    }

    @Override
    public void ejectCard() {
        System.out.println("You have to enter a card first");
    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("You have to enter a card first");
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("You have to enter a card first");
    }
}
