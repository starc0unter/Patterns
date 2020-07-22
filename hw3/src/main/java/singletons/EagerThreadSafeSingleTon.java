package singletons;

/**
 * Неленивый потокобезопасный синглтон.
 */
public class EagerThreadSafeSingleTon {
    public static final EagerThreadSafeSingleTon INSTANCE = new EagerThreadSafeSingleTon();

    public void doStuff() {}
}
