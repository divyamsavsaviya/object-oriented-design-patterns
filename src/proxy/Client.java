package proxy;

import State.TestATMMachine;

public class Client {
    public static void main(String[] args) {
        TestATMMachine.main(new String[0]);

        GetATMState atmProxy = new ATMProxy();
        System.out.println("\nCurrent ATM State: " + atmProxy.getATMState());
        System.out.println("\nCash in ATM Machine: " + atmProxy.getCashInMachine());
    }
}
