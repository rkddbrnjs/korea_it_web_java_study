package _25_castingAnimal;

public class Dog extends Animal{

    @Override
    public void speak() {
        System.out.println("멍멍");
    }

    public void wagTail(){
        System.out.println("꼬리를 흔든다.");
    }
}
