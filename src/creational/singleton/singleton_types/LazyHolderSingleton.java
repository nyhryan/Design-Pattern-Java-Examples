package creational.singleton.singleton_types;

public class LazyHolderSingleton implements ILoggable {
    private static class LazyHolder {
        public static final LazyHolderSingleton instance = new LazyHolderSingleton();
    }

    private LazyHolderSingleton() {}

    public static LazyHolderSingleton getInstance() {
        return LazyHolder.instance;
    }

    @Override
    public void log(String message) {
        System.out.printf(">> LazyHolder@%x: %s\n", hashCode(), message);
    }
}