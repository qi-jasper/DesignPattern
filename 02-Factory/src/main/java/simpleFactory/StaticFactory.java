package simpleFactory;

/**
 * @Description
 * @Author qi
 * @Date 2020/6/2 10:32
 * @ClassName StaticFactory
 **/

public class StaticFactory {

    // 改为静态写法
    public static Pizza createPizza(String orderType) {

        Pizza pizza = null;

        System.out.println("使用静态工厂模式");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName(" 希腊披萨 ");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName(" 奶酪披萨 ");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }

        return pizza;
    }
}
