package _24_Interface;

public class VolumeUpButton extends Button{
    @Override
    public void onPressed() {
        System.out.println("볼륨을 하나 올립니다.");
    }

    @Override
    public void onUp() {
        System.out.println("볼륨을 계속 올립니다.");
    }
}
