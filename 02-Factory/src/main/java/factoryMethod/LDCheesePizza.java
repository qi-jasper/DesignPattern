package factoryMethod;

/**
 * @Description
 * @Author qi
 * @Date 2020/6/6 16:34
 * @ClassName LDCheesePiza
 **/

public class LDCheesePizza extends Pizza{
    @Override
    public void prepare() {
        setName("伦敦奶酪");
        System.out.println("伦敦奶酪披萨准备原材料");
    }
}
