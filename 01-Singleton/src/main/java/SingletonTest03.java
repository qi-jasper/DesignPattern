/**
 * @Description 懒汉模式（线程不安全）
 * @Author qi
 * @Date 2020/5/30 21:09
 * @ClassName SingletonTest03
 **/

class Singleton03 {

    // 1.构造器私有化
    private Singleton03() {
        System.out.println("懒汉式创建单例模式，但是这种方式线程不安全！");
    }

    // 2.类内部创建对象
    private static Singleton03 instance;

    // 3.提供一个静态的公有方法，当使用到该方法时才去创建instance，即懒汉式
    public static Singleton03 getInstance() {
        if (instance == null) {
            instance = new Singleton03();
        }

        return instance;
    }

}

public class SingletonTest03 {
    public static void main(String[] args) {

        // 多线程时懒汉式的安全问题
        for (int i = 1; i <= 10; i++) {
            new Thread(() -> {
               Singleton03.getInstance();
            }).start();
        }

        /*Singleton03 instance1 = Singleton03.getInstance();
        Singleton03 instance2 = Singleton03.getInstance();

        System.out.println(instance1 == instance2);
        System.out.println("对象instance1的hashcode为：" + instance1.hashCode());
        System.out.println("对象instance2的hashcode为：" + instance2.hashCode());*/

    }
}
