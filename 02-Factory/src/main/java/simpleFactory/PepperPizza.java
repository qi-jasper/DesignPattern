package simpleFactory;

/**
 * @Description
 * @Author qi
 * @Date 2020/6/2 9:45
 * @ClassName PepperPizza
 **/

public class PepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给胡椒披萨准备原材料");
    }
}
