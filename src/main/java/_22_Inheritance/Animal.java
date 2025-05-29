package _22_Inheritance;

public class Animal {
    //필드(매개변수) == 객체의 속성
    private String animalName;
    private int animalAge;

    // 생성자
    public Animal(){

    }

    public Animal(String animalName) {
        this.animalName = animalName;
    }

    public Animal(int animalAge) {
        this.animalAge = animalAge;
    }

    public Animal(String animalName, int animalAge) {
        this.animalName = animalName;
        this.animalAge = animalAge;
    }

    public String getAnimalName() {
        return animalName;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }

    public void move() {
        System.out.println("움직입니다.");
    }
    //상속 관계에서 자식 클래스가 부모 클래스의 메소드를 재정의
    //부모로부터 물려받은 메소드를 자식이 다르게 실행하도록 바꾸는 것
    //부모 클래스의 메소드를 자식 클래스에서 동일한 이름, 매개변수, 리턴 타입으로 재정의
}
