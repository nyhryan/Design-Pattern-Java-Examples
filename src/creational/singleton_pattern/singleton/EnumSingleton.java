package creational.singleton_pattern.singleton;

public enum EnumSingleton implements ILoggable {
    INSTANCE;

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }

    @Override
    public void log(String message) {
        System.out.printf(">> Enum@%x: %s\n", hashCode(), message);
    }
}