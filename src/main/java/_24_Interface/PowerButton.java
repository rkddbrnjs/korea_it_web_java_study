package _24_Interface;

public class PowerButton extends Button {

    private boolean status = false;

    @Override
    public void onPressed() {
        if(status){
            status = false;
            System.out.println("전원을 끕니다.");
        }else {
            status = true;
            System.out.println("전원을 킵니다.");
        }
    }
}
