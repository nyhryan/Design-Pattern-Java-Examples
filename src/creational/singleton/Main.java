package creational.singleton;

import creational.singleton.singleton_types.*;
import static creational.singleton.SingletonTester.test;

public class Main {
    public static void main(String[] args) {
        // You can test the singleton classes here
        // Test if instances in two threads are the same

        // Thread safe ones
//        test(EagerSingleton.class);
//        test(DCLSingleton.class);
//        test(LazyHolderSingleton.class);
//        test(EnumSingleton.class);

        // Thread unsafe one
        // Try multiple times to see the difference of instance hash
        test(ThreadUnsafeLazySingleton.class);

        // Singleton logger Usage
//        ILoggable logger = ThreadUnsafeLazySingleton.getInstance();
//        logger.log("Hello, World 11!");
//        logger.log("Hello, World 22!");
    }
}