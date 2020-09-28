package bridge;

/**
 * @Description
 * @Author qi
 * @Date 2020/6/13 22:06
 * @ClassName Phone
 **/

public abstract class Phone {
    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    protected void open() {
        this.brand.open();
    }

    protected void call() {
        this.brand.call();
    }

    protected void close() {
        this.brand.close();
    }
}