package simpleFactory;

/**
 * @Description
 * @Author qi
 * @Date 2020/6/2 10:06
 * @ClassName SimpleFactory
 **/

// 简单工厂类
public class SimpleFactory {

    // 接收orderType 返回对应的Pizza对象
    public Pizza createPizza(String orderType) {

        Pizza pizza = null;

        System.out.println("使用简单工厂模式");
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
