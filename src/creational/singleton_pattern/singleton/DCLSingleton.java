package creational.singleton_pattern.singleton;

public class DCLSingleton implements ILoggable {
    // Double-Checked Locking Singleton requires volatile keyword
    // to prevent reordering of instructions by the compiler
    private static volatile DCLSingleton instance;
    private DCLSingleton() {}

    public static DCLSingleton getInstance() {
        if (instance == null) {
            synchronized (DCLSingleton.class) {
                if (instance == null) {
                    // HERE! volatile keyword makes sure other threads know about the newly created instance
                    instance = new DCLSingleton();
                }
            }
        }
        return instance;
    }

    @Override
    public void log(String message) {
        System.out.printf(">> DCL@%x: %s\n", hashCode(), message);
    }
}
