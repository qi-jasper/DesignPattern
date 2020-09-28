/**
 * @Description 懒汉式（线程安全，同步方法）
 * @Author qi
 * @Date 2020/5/30 21:44
 * @ClassName SingletonTest04
 **/

class Singleton04 {

    // 1.构造器私有化
    private Singleton04() {
        System.out.println("懒汉式创建单例模式，使用synchronized关键字同步方法解决线程不安全问题！");
    }

    // 2.类内部创建对象
    private static Singleton04 instance;

    // 3.提供一个静态的公有方法，当使用到该方法时才去创建instance，即懒汉式
    // 使用同步方法机制
    public static synchronized Singleton04 getInstance() {
        if (instance == null) {
            instance = new Singleton04();
        }

        return instance;
    }
}

public class SingletonTest04 {
    public static void main(String[] args) {

        // 多线程时懒汉式的安全问题
        for (int i = 1; i <= 10; i++) {
            new Thread(() -> {
                Singleton04.getInstance();
            }).start();
        }
    }
}
