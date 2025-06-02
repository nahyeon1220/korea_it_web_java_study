package _21_Class.WaterBottle;

public class WaterBottle {

    private int currentWater;

    public void fill(int water) {
        if(water > 0 && currentWater + water <= 1000) {
            currentWater += water;
            System.out.println(water + "L의 물을 담았습니다. 현재 물의 양: " + currentWater + "L");
        } else {
            System.out.println("0L 미만이거나 1000L 이상 담을 수 없습니다. 현재 물의 양: " + currentWater + "L" );
        }

    }

    public int getCurrentWater() {
        return currentWater;
    }

    public void drink(int water) {
        if (water > 0 && water <= currentWater) {
            currentWater -= water;
            System.out.println("마신 물의 양은 " + water + "L입니다. 현재 물의 양: " + currentWater + "L");
        } else {
            System.out.println("0L 이하의 물을 마셨거나 현재 물의 양이 부족합니다. 현재 물의 양: " + currentWater + "L");
        }


    }
}
