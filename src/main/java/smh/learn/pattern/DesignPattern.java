package smh.learn.pattern;

import com.sun.deploy.security.ValidationState;
import smh.learn.pattern.singleton.AbstractSingleton;

import java.util.HashMap;
import java.util.Map;

/**
 * 设计模式
 */
public enum DesignPattern {
    DESIGN_PATTERN;
    private static Map<Type, Type.Pattern[]> map = new HashMap<Type, Type.Pattern[]>(ValidationState.TYPE.values().length);

    static {
        //创建型模型
        map.put(
                Type.CREATION_PATTERN, new Type.Pattern[]{
                        Type.Pattern.FACTORY,
                        Type.Pattern.ABSTRACT_FACTORY,
                        Type.Pattern.SINGLETON,
                        Type.Pattern.BUILDER,
                        Type.Pattern.PROTOTYPE
                });
    }

    enum Type {
        CREATION_PATTERN("创建型模型", "Creation Pattern");

        Type(String cn, String english) {
        }

        enum Pattern {


            FACTORY("工厂模式", "Factory Pattern", DesignPattern.class),
            ABSTRACT_FACTORY("抽象工厂模式", "Abstract Factory Pattern", DesignPattern.class),
            SINGLETON("单例模式", "Singleton Pattern", AbstractSingleton.class),
            BUILDER("建造者模式", "Builder Pattern", DesignPattern.class),
            PROTOTYPE("原型模式", "Prototype Pattern", DesignPattern.class);

            Pattern(String cn, String english, Class c) {

            }
        }
    }
}
