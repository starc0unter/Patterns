package singletons;

/**
 * Высокопроизводительный ленивый синглтон.
 * Работает только для статических полей класса.
 */
public class OnDemandHolderIdiom {
    public static class SingletonHolder {
        public static final OnDemandHolderIdiom HOLDER_INSTANCE = new OnDemandHolderIdiom();
    }

    public static OnDemandHolderIdiom getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }

    public void doStuff() {}
}
