package _21_Class.WaterBottle;

public class WaterBottle {
   private int currentWater;

    public void fill(int water){
        if(water > 0 && currentWater + water <= 1000){
            currentWater += water ;
            System.out.println("물이" + water + "만큼 채워졌습니다" + "현재 용량 " + currentWater);
        }else if(currentWater + water > 1000){
            System.out.println("물이 넘칩니다");
        }else if (water < 0){
            System.out.println("넣을 물이 없습니다,");
        }
    }
    public void drink(int water){
        if(water > 0 && water <= currentWater){
            currentWater -= water;
            System.out.println("물을" + water + "만큼 마셨습니다" + "현재 용량" + currentWater );
        }else {
            System.out.println("물이 부족합니다.");
        }
    }

    public int getCurrentWater() {
        return currentWater;
    }
}
