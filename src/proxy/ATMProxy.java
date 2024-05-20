package proxy;

import State.ATMMachine;
import State.ATMState;

public class ATMProxy implements GetATMState {
    @Override
    public ATMState getATMState() {
        ATMMachine realATMMachine = new ATMMachine();
        return realATMMachine.getATMState();
    }

    @Override
    public int getCashInMachine() {
        ATMMachine realATMMachine = new ATMMachine();
        return realATMMachine.getCashInMachine();
    }
}
