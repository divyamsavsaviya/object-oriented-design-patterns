package State;

public class HasPin implements ATMState {

    ATMMachine atmMachine;
    public HasPin(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Card already inserted");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card ejected");
        atmMachine.setATMState(atmMachine.getNoCardState());
    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("Already entered PIN");
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        if (cashToWithdraw > atmMachine.cashInMachine) {
            System.out.println("Not enough cash available");
            System.out.println("Card ejected");
            atmMachine.setATMState(atmMachine.getNoCardState());
        } else {
            System.out.println(cashToWithdraw + " is provided by the machine");
            atmMachine.setCashInMachine(atmMachine.cashInMachine - cashToWithdraw);
            System.out.println("Card ejected");
            atmMachine.setATMState(atmMachine.getNoCardState());
            if (atmMachine.cashInMachine <= 0) {
                atmMachine.setATMState(atmMachine.getNoCashState());
            }
        }
    }
}
