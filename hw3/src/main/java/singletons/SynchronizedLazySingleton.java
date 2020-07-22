package singletons;

/**
 * Низкопроизводительный ленивый синглтон.
 * Главная причина низкой производительности - синхронизация доступа по классу.
 */
public class SynchronizedLazySingleton {
    private static SynchronizedLazySingleton instance;

    public static synchronized SynchronizedLazySingleton getInstance() {
        if (instance == null) {
            instance = new SynchronizedLazySingleton();
        }
        return instance;
    }

    public void doStuff() {}
}
