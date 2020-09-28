package builder;

/**
 * @Description 具体建造者类：别墅建造
 * @Author qi
 * @Date 2020/6/9 11:30
 * @ClassName VillaHouse
 **/

public class VillaHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("别墅打地基10m");
    }

    @Override
    public void buildWall() {
        System.out.println("别墅砌墙20m");
    }

    @Override
    public void roofed() {
        System.out.println("别墅封顶");
    }
}
