package factoryMethod;

/**
 * @Description
 * @Author qi
 * @Date 2020/6/6 16:49
 * @ClassName LDOrderPizza
 **/

public class LDOrderPizza extends OrderPizza{
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese"))
            pizza = new LDCheesePizza();
        else if (orderType.equals("pepper"))
            pizza = new LDPepperPizza();

        return pizza;
    }
}
