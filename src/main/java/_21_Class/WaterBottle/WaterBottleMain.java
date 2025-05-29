package _21_Class.WaterBottle;

public class WaterBottleMain {
    public static void main(String[] args) {
        WaterBottle waterBottle = new WaterBottle();

        waterBottle.fill(100);
        waterBottle.fill(900);
        waterBottle.fill(100);
        waterBottle.drink(500);
        waterBottle.drink(600);
        System.out.println(waterBottle.getCurrentWater());

    }
}
