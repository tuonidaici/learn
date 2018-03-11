package smh.learn.pattern.singleton;

public class HungrySingleton extends AbstractSingleton {
    @Override
    protected void comment() {
        //饿汉式
    }

    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}
