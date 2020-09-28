package builder;

/**
 * @Description 产品类，对应Product
 * @Author qi
 * @Date 2020/6/9 11:23
 * @ClassName House
 **/

public class House {

    // 地基
    private String baise;
    // 墙
    private String wall;
    // 屋顶
    private String roofed;

    public String getBaise() {
        return baise;
    }

    public void setBaise(String baise) {
        this.baise = baise;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoofed() {
        return roofed;
    }

    public void setRoofed(String roofed) {
        this.roofed = roofed;
    }
}
