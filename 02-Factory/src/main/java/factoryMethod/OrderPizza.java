package factoryMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Description
 * @Author qi
 * @Date 2020/6/6 16:39
 * @ClassName OrderPizza
 **/

public abstract class OrderPizza {

    public OrderPizza() {
        Pizza pizza = null;

        // 订购披萨的类型
        String orderType;
        do {
            orderType = getType();

            // 抽象方法，由子类工厂实现
            pizza = createPizza(orderType);

            //输出pizza 制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();

        } while (true);
    }

    // 写一个方法，可以获取客户希望订购的披萨种类
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    // 定义一个抽象方法，让各个工厂子类自己实现
    abstract Pizza createPizza(String orderType);
}
