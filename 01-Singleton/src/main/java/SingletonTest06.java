/**
 * @Description 懒汉式，使用双重检查（DCL）解决线程安全问题
 * @Author qi
 * @Date 2020/5/30 22:05
 * @ClassName SingletonTest06
 **/

class Singleton06 {

    // 1.构造器私有化
    private Singleton06() {
        System.out.println("懒汉式创建单例模式，使用双重检查解决线程安全问题。");
    }

    // 2.类内部创建对象
    // 使用volatile关键字保证原子性，避免指令重排
    private static volatile Singleton06 instance;

    // 3.提供一个静态的公有方法，当使用到该方法时才去创建instance，即懒汉式
    public static Singleton06 getInstance() {
        if (instance == null) {
            // 加入同步代码块
            synchronized (Singleton06.class) {
                // 双重检查
                if (instance == null) {
                    instance = new Singleton06();
                }
            }
        }

        return instance;
    }
}

public class SingletonTest06 {
    public static void main(String[] args) {
        // 多线程时懒汉式的安全问题
        for (int i = 1; i <= 10; i++) {
            new Thread(() -> {
                Singleton06.getInstance();
            }).start();
        }
    }
}
