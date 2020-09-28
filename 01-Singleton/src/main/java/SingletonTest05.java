/**
 * @Description 懒汉式（线程不安全，同步代码块）
 * @Author qi
 * @Date 2020/5/30 21:53
 * @ClassName SingletonTest05
 **/

class Singleton05 {

    // 1.构造器私有化
    private Singleton05() {
        System.out.println("懒汉式创建单例模式，使用同步代码块的方式，但仍然是线程不安全的！！！");
    }

    // 2.类内部创建对象
    private static Singleton05 instance;

    // 3.提供一个静态的公有方法，当使用到该方法时才去创建instance，即懒汉式
    public static Singleton05 getInstance() {
        if (instance == null) {
            // 加入同步代码块
            synchronized (Singleton05.class) {
                instance = new Singleton05();
            }
        }

        return instance;
    }
}

public class SingletonTest05 {
    public static void main(String[] args) {
        // 多线程时懒汉式的安全问题
        for (int i = 1; i <= 10; i++) {
            new Thread(() -> {
                Singleton05.getInstance();
            }).start();
        }
    }
}
