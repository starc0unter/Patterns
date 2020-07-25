package singletons;

/**
 * Неленивый синглтон в виде Enum.
 * Преимущества: готовая сериализация и потокобезопасность.
 */
public enum EnumSingleton {
    INSTANCE;

    public void doStuff() {}
}
