package bridge;

/**
 * @Description
 * @Author qi
 * @Date 2020/6/13 22:10
 * @ClassName Huawei
 **/

public class Huawei implements Brand {

    public void open() {
        System.out.println("华为手机开机...");
    }

    public void call() {
        System.out.println("华为手机打电话...");
    }

    public void close() {
        System.out.println("华为手机关机...");
    }
}