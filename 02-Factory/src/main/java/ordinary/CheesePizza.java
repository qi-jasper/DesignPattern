package ordinary;

/**
 * @Description
 * @Author qi
 * @Date 2020/6/2 9:41
 * @ClassName CheesePizza
 **/

public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给奶酪披萨准备原材料");
    }
}
