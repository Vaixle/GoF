package singletone.impl;

public class Singleton {

    private static volatile Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        Singleton result = instance;
        if (instance != null)
            return result;

        synchronized (Singleton.class) {
            if (instance == null)
                instance = new Singleton();
            return instance;
        }
    }
}
