package deepclone;

public class SheepClient {

    public static void main(String[] args) {

            Sheep sheep = new Sheep("tim", 1, "Black");
            sheep.friend = new Sheep("jack", 2, "white");

            Sheep sheep1 = (Sheep) sheep.clone();
            Sheep sheep2 = (Sheep) sheep.clone();
            Sheep sheep3 = (Sheep) sheep.clone();
            Sheep sheep4 = (Sheep) sheep.clone();

            System.out.println(sheep);

            System.out.println("使用原型模式进行羊的克隆...");

            System.out.println(sheep1 + "friendHashcode：" + sheep1.friend.hashCode());
            System.out.println(sheep2 + "friendHashcode：" + sheep2.friend.hashCode());
            System.out.println(sheep3 + "friendHashcode：" + sheep3.friend.hashCode());
            System.out.println(sheep4 + "friendHashcode：" + sheep4.friend.hashCode());
    }
}
