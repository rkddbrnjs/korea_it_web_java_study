package _25_casting.Control;

public class Mouse implements Power{
    @Override
    public void on() {
        System.out.println("마우스를 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("마우스를 끕니다.");
    }
    public void changeMouse(){
        System.out.println("마우스를 바꿉니다.");
    }
}
