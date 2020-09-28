/**
 * @Description 饿汉式（静态变量）
 * @Author qi
 * @Date 2020/5/30 12:23
 * @ClassName SingletonTest01
 **/

class Singleton01 {

    // 1.构造器私有化
    private Singleton01() {
        System.out.println("饿汉式单例模式，静态变量方法创建");
    }

    // 2.本类内部创建对象实例
    private final static Singleton01 INSTANCE = new Singleton01();

    // 3.提供公有方法
    public static Singleton01 getInstance() {
        return INSTANCE;
    }
}

public class SingletonTest01 {
    public static void main(String[] args) {

        Singleton01 instance1 = Singleton01.getInstance();
        Singleton01 instance2 = Singleton01.getInstance();

        System.out.println(instance1 == instance2);
        System.out.println("对象instance1的hashcode为：" + instance1.hashCode());
        System.out.println("对象instance2的hashcode为：" + instance2.hashCode());
    }
}