package ordinary;

/**
 * @Description
 * @Author qi
 * @Date 2020/6/2 9:37
 * @ClassName Pizza
 **/

// 抽象的披萨类
public abstract class Pizza {
    protected String name; //名字

    // 准备原材料, 不同的披萨不一样，因此，我们做成抽象方法
    public abstract void prepare();


    public void bake() {
        System.out.println(name + " baking;");
    }

    public void cut() {
        System.out.println(name + " cutting;");
    }

    // 打包
    public void box() {
        System.out.println(name + " boxing;");
    }

    public void setName(String name) {
        this.name = name;
    }
}
