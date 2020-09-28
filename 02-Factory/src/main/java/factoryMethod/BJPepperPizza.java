package factoryMethod;

/**
 * @Description
 * @Author qi
 * @Date 2020/6/6 16:33
 * @ClassName BJPepperPizza
 **/

public class BJPepperPizza extends Pizza{
    @Override
    public void prepare() {
        setName("北京胡椒");
        System.out.println("北京胡椒披萨准备原材料");
    }
}
