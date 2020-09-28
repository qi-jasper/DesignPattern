package factoryMethod;

/**
 * @Description
 * @Author qi
 * @Date 2020/6/6 16:44
 * @ClassName BJOrderPizza
 **/

public class BJOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese"))
            pizza = new BJCheesePizza();
        else if (orderType.equals("pepper"))
            pizza = new BJPepperPizza();

        return pizza;
    }
}
