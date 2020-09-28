package bridge;

/**
 * @Description 折叠手式手机，继承抽象类Phone
 * @Author qi
 * @Date 2020/6/13 22:14
 * @ClassName FoldedPhone
 **/

public class FoldedPhone extends Phone {

    public FoldedPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        super.open();
        System.out.println("折叠式手机开机");
    }

    @Override
    public void call() {
        super.call();
        System.out.println("折叠式手机打电话");
    }

    @Override
    public void close() {
        super.close();
        System.out.println("折叠式手机关机");
    }
}