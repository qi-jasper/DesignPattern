/**
 * @Description 懒汉模式，静态内部类实现
 * @Author qi
 * @Date 2020/5/30 22:17
 * @ClassName SingletonTest07
 **/

class Singleton07 {
    private Singleton07() {
        System.out.println("懒汉式，通过静态内部类方式实现，是线程安全的。");
    }

    private static class SingletonInnder {
        private static final Singleton07 INSTANCE = new Singleton07();
    }

    public static Singleton07 getInstance() {
        return SingletonInnder.INSTANCE;
    }
}

public class SingletonTest07 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                Singleton07.getInstance();
            }).start();
        }
    }
}
