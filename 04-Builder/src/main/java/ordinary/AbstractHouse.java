package ordinary;

/**
 * @Description
 * @Author qi
 * @Date 2020/6/9 10:01
 * @ClassName AbstractHouse
 **/

public abstract class AbstractHouse {

    // 打地基
    public abstract void buildBasic();

    // 砌墙
    public abstract void buildWalls();

    // 封顶
    public abstract void roofed();

    public void build() {
        buildBasic();
        buildWalls();
        roofed();
    }
}
