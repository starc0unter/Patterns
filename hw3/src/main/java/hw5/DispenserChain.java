package hw5;

public abstract class DispenserChain {
    public abstract void setNextChain(DispenserChain nextChain);

    public abstract void dispense(Currency cur);

    protected static void dispenseGeneric(Currency currency, int by, DispenserChain next) {
        if (currency.getAmount() < by) {
            next.dispense(currency);
            return;
        }

        int remainder = currency.getAmount() % by;
        System.out.println("Dispensing " + currency.getAmount() / by + ' ' + by + "$ note");
        if (remainder != 0) next.dispense(new Currency(remainder));
    }
}
