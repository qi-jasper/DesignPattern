package prototype;

public class Client {

    public static void main(String[] args) {

        Sheep sheep = new Sheep("tim", 1, "Black");

        Sheep sheep1 = (Sheep) sheep.clone();
        Sheep sheep2 = (Sheep) sheep.clone();
        Sheep sheep3 = (Sheep) sheep.clone();
        Sheep sheep4 = (Sheep) sheep.clone();

        System.out.println(sheep);

        System.out.println("使用原型模式进行羊的克隆...");

        System.out.println(sheep1);
        System.out.println(sheep2);
        System.out.println(sheep3);
        System.out.println(sheep4);

    }
}