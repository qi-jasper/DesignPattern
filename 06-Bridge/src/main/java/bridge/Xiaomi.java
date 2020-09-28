package bridge;

/**
 * @Description
 * @Author qi
 * @Date 2020/6/13 22:09
 * @ClassName Xiaomi
 **/

public class Xiaomi implements Brand {

    public void open() {
        System.out.println("小米手机开机...");
    }

    public void call() {
        System.out.println("小米手机打电话...");
    }

    public void close() {
        System.out.println("小米手机关机...");
    }
}