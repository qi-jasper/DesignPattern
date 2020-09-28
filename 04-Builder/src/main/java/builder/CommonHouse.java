package builder;

/**
 * @Description 具体建造者类：普通房建造
 * @Author qi
 * @Date 2020/6/9 11:28
 * @ClassName CommonHouse
 **/

public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基5m");
    }

    @Override
    public void buildWall() {
        System.out.println("普通房子砌墙10m");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子封顶");
    }
}
