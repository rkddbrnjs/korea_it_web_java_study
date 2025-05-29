package _21_Class.Car;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car("아반떼");
        System.out.println(car1.carName);

        Car car2 = new Car("K5");
        System.out.println(car2.carName);

        Car car3 = new Car("싼타페",2025,"white");
        System.out.println(car3.carName);
        System.out.println(car3.carYearModel);
        System.out.println(car3.carColor);

        car3.startCar(); //안에 돌아가는건 안보여주고
    }
}
