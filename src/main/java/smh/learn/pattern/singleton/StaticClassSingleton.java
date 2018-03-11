package smh.learn.pattern.singleton;

public class StaticClassSingleton extends AbstractSingleton {
    @Override
    protected void comment() {
        //登记式/静态内部类
    }

    private StaticClassSingleton() {
    }

    private static class SingletonHolder {
        private static final StaticClassSingleton INSTANCE = new StaticClassSingleton();
    }

    public static StaticClassSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
