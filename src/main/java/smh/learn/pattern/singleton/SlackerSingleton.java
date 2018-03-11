package smh.learn.pattern.singleton;

/**
 * 懒汉式
 */
public class SlackerSingleton extends AbstractSingleton {
    @Override
    protected void comment() {
        //懒汉式
    }

    private static SlackerSingleton instance;

    private SlackerSingleton() {
    }

    public static synchronized SlackerSingleton getInstance() {
        if (instance == null) {
            instance = new SlackerSingleton();
        }
        return instance;
    }
}
