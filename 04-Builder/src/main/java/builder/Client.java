package builder;

/**
 * @Description
 * @Author qi
 * @Date 2020/6/9 11:36
 * @ClassName Client
 **/

public class Client {

    public static void main(String[] args) {

        System.out.println("建造一所普通的房...");

        // 建造一个普通的房子
        CommonHouse commonHouse = new CommonHouse();
        // 准备创建房子的指挥者
        HouseDirector houseDirector = new HouseDirector(commonHouse);

        // 完成产品建造（盖房子），返回产品（房子）
        House house = houseDirector.constructorHouse();

        System.out.println("=============");

        System.out.println("建造一栋别墅...");

        // 建造一个别墅
        VillaHouse villaHouse = new VillaHouse();
        // 重置建造者
        houseDirector.setHouseBuilder(villaHouse);
        // 完成别墅，返回别墅
        houseDirector.constructorHouse();

    }
}
