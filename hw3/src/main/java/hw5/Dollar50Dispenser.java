package hw5;

public class Dollar50Dispenser extends DispenserChain {

    private DispenserChain next;

    @Override
    public void setNextChain(DispenserChain nextChain) {
        this.next = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        dispenseGeneric(currency, 50, next);
    }

}