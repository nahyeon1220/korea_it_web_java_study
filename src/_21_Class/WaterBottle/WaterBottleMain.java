package _21_Class.WaterBottle;

public class WaterBottleMain {
    public static void main(String[] args) {

        WaterBottle waterBottle = new WaterBottle();

        waterBottle.fill(500);
        waterBottle.drink(200);
        waterBottle.fill(800);
        waterBottle.drink(1200);

        System.out.println(waterBottle.getCurrentWater());
    }
}
