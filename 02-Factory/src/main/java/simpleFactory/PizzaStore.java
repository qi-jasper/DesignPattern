package simpleFactory;

/**
 * @Description
 * @Author qi
 * @Date 2020/6/2 9:48
 * @ClassName PizzaStore
 **/

// 相当于一个客户端，发出订购
public class PizzaStore {
    public static void main(String[] args) {
        // 使用简单工厂模式
        new OrderPizza(new SimpleFactory());
        // 使用静态工厂模式
        new StaticOrder();
    }
}
