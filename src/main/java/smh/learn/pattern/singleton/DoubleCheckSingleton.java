package smh.learn.pattern.singleton;

public class DoubleCheckSingleton extends AbstractSingleton {
    @Override
    protected void comment() {
        //双检锁/双重校验锁 DCL
    }

    private volatile static DoubleCheckSingleton singleton;

    private DoubleCheckSingleton() {
    }

    public static DoubleCheckSingleton getSingleton() {
        if (singleton == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (singleton == null) {
                    singleton = new DoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }
}
