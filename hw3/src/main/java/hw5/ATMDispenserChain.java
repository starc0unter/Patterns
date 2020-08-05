package hw5;

import java.util.Scanner;

public class ATMDispenserChain {
    private final DispenserChain first;

    public ATMDispenserChain() {
        this.first = new Dollar50Dispenser();
        DispenserChain second = new Dollar20Dispenser();
        DispenserChain third = new Dollar10Dispenser();

        first.setNextChain(second);
        second.setNextChain(third);
    }

    public static void main(String[] args) {
        ATMDispenserChain atmDispenser = new ATMDispenserChain();
        while (true) {
            final int amount = getAmount();
            if (amount < 0) {
                System.out.println("Amount should be in multiple of 10s.");
                return;
            }
            atmDispenser.first.dispense(new Currency(amount));
        }

    }

    private static int getAmount() {
        System.out.println("Enter amount to dispense");
        Scanner input = new Scanner(System.in);
        int amount = input.nextInt();
        return amount % 10 != 0 ? -1 : amount;
    }

}