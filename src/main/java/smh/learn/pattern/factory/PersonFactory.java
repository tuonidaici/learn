package smh.learn.pattern.factory;

public class PersonFactory {
    public static Person getPerson(boolean sex) {
        if (sex) {
            return new Man();
        } else {
            return new Women();
        }
    }

    public static void main(String[] args) {
        {
            /*
              PersonFactory 创建一个工厂，生成基于给定信息的实体类的对象。

              使用该工厂，通过传递类型信息来获取实体类的对象。


               1、日志记录器：记录可能记录到本地硬盘、系统事件、远程服务器等，用户可以选择记录日志到什么地方。
               2、数据库访问，
               当用户不知道最后系统采用哪一类数据库，以及数据库可能有变化时。
               3、设计一个连接服务器的框架，需要三个协议，"POP3"、"IMAP"、"HTTP"，
               可以把这三个作为产品类，共同实现一个接口。
             */
        }
        Person person = PersonFactory.getPerson(false);
        System.out.println(person.getSex());
        Person person2 = PersonFactory.getPerson(true);
        System.out.println(person2.getSex());
    }
}
