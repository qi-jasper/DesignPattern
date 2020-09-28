package builder;

/**
 * @Description 抽象的建造者类
 * @Author qi
 * @Date 2020/6/9 11:25
 * @ClassName HouseBuilder
 **/

public abstract class HouseBuilder {

    protected House house = new House();

    // 将建造的流程写好，抽象的方法
    public abstract void buildBasic();
    public abstract void buildWall();
    public abstract void roofed();

    // 建造房子，对应于build方法，将产品（房子）返回
    public House buildHouse() {
        return house;
    }
}
