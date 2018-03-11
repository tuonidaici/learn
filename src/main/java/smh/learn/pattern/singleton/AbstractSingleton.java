package smh.learn.pattern.singleton;

/**
 * 123
 */
public abstract class AbstractSingleton {
    protected abstract void comment();

    public static void main(String[] args) {
        /**
         * 一般情况下，不建议使用懒汉方式，
         * 建议使用饿汉方式。只有在要明确实现 lazy loading 效果时，
         * 才会使用登记方式。如果涉及到反序列化创建对象时，
         * 可以尝试使用第枚举方式。
         * 如果有其他特殊的需求，可以考虑使用第 4 种双检锁方式。
         */
        {

        }
        // @Deprecated
        SlackerSingleton.getInstance().comment();
        HungrySingleton.getInstance().comment();
        DoubleCheckSingleton.getSingleton().comment();
        StaticClassSingleton.getInstance().comment();
        //最优
        EnumSingleton.comment();
    }
}
