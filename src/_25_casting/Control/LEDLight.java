package _25_casting.Control;

public class LEDLight implements Power{
    @Override
    public void on() {
        System.out.println("LED를 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("LED를 끕니다.");
    }

    public void changeColor(){
        System.out.println("LED색상을 바꿉니다.");
    }
}
