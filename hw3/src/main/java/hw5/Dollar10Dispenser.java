package hw5;

public class Dollar10Dispenser extends DispenserChain {

    private DispenserChain next;

    @Override
    public void setNextChain(DispenserChain nextChain) {
        this.next = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        dispenseGeneric(currency, 10, next);
    }

}
