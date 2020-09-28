package factoryMethod;

/**
 * @Description
 * @Author qi
 * @Date 2020/6/6 16:32
 * @ClassName BJCheesePizza
 **/

public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京奶酪");
        System.out.println("北京奶酪pizz准备原材料");
    }
}
