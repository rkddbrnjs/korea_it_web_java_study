package _25_casting.Control;

public class Smartphone implements Power{
    @Override
    public void on() {
        System.out.println("스마트폰을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("스마트폰을 끕니다.");
    }
    public void call(){
        System.out.println("전화를 합니다.");
    }
}
