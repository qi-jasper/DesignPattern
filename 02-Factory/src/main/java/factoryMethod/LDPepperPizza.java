package factoryMethod;

/**
 * @Description
 * @Author qi
 * @Date 2020/6/6 16:35
 * @ClassName LDPepperPizza
 **/

public class LDPepperPizza extends Pizza{
    @Override
    public void prepare() {
        setName("伦敦胡椒");
        System.out.println("伦敦胡椒披萨准备原材料");
    }
}
