package creational.singleton;

public class SingletonTester {
    private enum ThreadId {
        T1, T2
    }

    private static void job(java.lang.Class<?> classType, ThreadId id) {
        for (int i = 0; i < 10; i++) {
            try {
                var getInstance = classType.getMethod("getInstance");
                var instance = getInstance.invoke(null);

                switch (id) {
                    case T1: {
                        System.out.printf("%14x |\n", instance.hashCode());
                        break;
                    }
                    case T2: {
                        System.out.printf("%14s | %-14x\n", "", instance.hashCode());
                        break;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void test(Class<?> classType) {
        System.out.println("Testing " + classType.getSimpleName() + "...");
        System.out.printf("%14s | %-14s\n", "T1 Instance", "T2 Instance");
        System.out.println("-------------------------------");

        Thread t1 = new Thread(() -> job(classType, ThreadId.T1));
        Thread t2 = new Thread(() -> job(classType, ThreadId.T2));

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("-------------------------------");
        }
    }
}
