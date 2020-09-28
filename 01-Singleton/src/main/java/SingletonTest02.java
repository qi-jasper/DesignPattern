/**
 * @Description 饿汉式（静态代码块）
 * @Author qi
 * @Date 2020/5/30 12:33
 * @ClassName SingletonTest02
 **/

class Singleton02 {

    // 1.构造器私有化
    private Singleton02() {
        System.out.println("饿汉式单例模式，静态代码块方法创建");
    }

    // 2.类内部创建对象
    private static Singleton02 instance;

    // 3.静态代码块中实例化
    static {
        instance = new Singleton02();
    }

    // 4.提供公有方法返回实例对象
    public static Singleton02 getInstance() {
        return instance;
    }
}

public class SingletonTest02 {
    public static void main(String[] args) {
        Singleton02 instance1 = Singleton02.getInstance();
        Singleton02 instance2 = Singleton02.getInstance();

        System.out.println(instance1 == instance2);
        System.out.println("对象instance1的hashcode为：" + instance1.hashCode());
        System.out.println("对象instance2的hashcode为：" + instance2.hashCode());
    }
}
