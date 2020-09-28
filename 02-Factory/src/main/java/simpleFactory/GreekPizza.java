package simpleFactory;

/**
 * @Description
 * @Author qi
 * @Date 2020/6/2 9:42
 * @ClassName GreekPizza
 **/

public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给希腊披萨准备原材料");
    }
}
