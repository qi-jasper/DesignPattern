package bridge;

/**
 * @Description
 * @Author qi
 * @Date 2020/6/14 12:58
 * @ClassName Client
 **/

public class Client {

    public static void main(String[] args) {
        // 获取折叠式手机（样式+品牌）
        Phone p1 = new FoldedPhone(new Xiaomi());
        p1.open();
        p1.call();
        p1.close();

        System.out.println("===================");

        Phone p2 = new FoldedPhone(new Huawei());
        p2.open();
        p2.call();
        p2.close();

    }

}