package x.crazyjvm.singleton.j;

public class Singleton {
}

class Cat implements Runnable {
    private static final Cat instance = new Cat();

    private Cat() {}

    public void run() {
        // do nothing
    }

    public static Cat getInstance() {
        return instance;
    }
}
