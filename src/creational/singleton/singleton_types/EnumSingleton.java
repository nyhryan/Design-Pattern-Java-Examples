package creational.singleton.singleton_types;

public enum EnumSingleton implements ILoggable {
    INSTANCE;

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }

    /**
     * Usage: <code>EnumSingleton.INSTANCE.log("Hello, World!");</code>
     * @param message
     */
    @Override
    public void log(String message) {
        System.out.printf(">> Enum@%x: %s\n", hashCode(), message);
    }
}