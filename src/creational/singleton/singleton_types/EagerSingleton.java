package creational.singleton.singleton_types;

public class EagerSingleton implements ILoggable {
    private final static EagerSingleton instance = new EagerSingleton();
    private EagerSingleton() {}

    public static EagerSingleton getInstance() {
        return instance;
    }

    @Override
    public void log(String message) {
        System.out.printf(">> Eager@%x: %s\n", hashCode(), message);
    }
}
