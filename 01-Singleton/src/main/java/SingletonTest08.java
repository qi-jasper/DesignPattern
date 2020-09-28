/**
 * @Description 使用枚举实现单例模式
 * @Author qi
 * @Date 2020/5/30 22:29
 * @ClassName SingletonTest08
 **/

enum Singleton08 {
    // 1.枚举类中的对象
    // 相当于：public static final Singleton08 INSTANCE = new Singleton08();
    INSTANCE;
    public void anyMethod() {
        System.out.println("通过枚举实现单例模式");
    }
}

public class SingletonTest08 {
    public static void main(String[] args) {

        // 通过枚举类中定义好的对象，创建对象实例
        Singleton08 instance1 = Singleton08.INSTANCE;
        Singleton08 instance2 = Singleton08.INSTANCE;
        System.out.println(instance1 == instance2);
        instance1.anyMethod();

        /*for (int i = 0; i < 1; i++) {
            new Thread(() -> {
                Singleton08 instance = Singleton08.INSTANCE;
                instance.anyMethod();
            }).start();
        }*/
    }
}
