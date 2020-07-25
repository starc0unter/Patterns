package singletons;

/**
 * Стандарт синглтона, показанный на уроке.
 * Ленивый, потокобезопасный, работает после JDK 1.5
 */
public class GoldenStandard {
    //наличие volatile тут критично
    private static volatile GoldenStandard instance;

    public static GoldenStandard getInstance() {
        GoldenStandard localInstance = instance;
        if (localInstance == null) {
            synchronized (GoldenStandard.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new GoldenStandard();
                }
            }
        }
        return localInstance;
    }

    public void doStuff() {}
}
