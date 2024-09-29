package creational.singleton_pattern.singleton;

public class ThreadUnsafeLazySingleton implements ILoggable {
    private static ThreadUnsafeLazySingleton instance;

    private ThreadUnsafeLazySingleton() {}

    public static ThreadUnsafeLazySingleton getInstance() {
        // This implementation is not thread-safe
        // It is possible that two threads enter this method at the same time
        if (instance == null) {
            instance = new ThreadUnsafeLazySingleton();
        }
        return instance;
    }

    @Override
    public void log(String message) {
        System.out.printf(">> ThreadUnsafeLazy@%x: %s\n", hashCode(), message);
    }
}
