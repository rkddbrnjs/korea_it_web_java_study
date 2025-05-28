package _26_Objects;

public class Main {
    public static void main(String[] args) {
        //모든 클래스는 Object를 상속받고 있다.
        //equals가 true가 되려면 해시코드 값이 같아야한다.
        Teacher teacher1 = new Teacher("이동윤","코리아IT");
        Teacher teacher2 = new Teacher("이동윤","코리아IT");
        System.out.println(teacher1.toString());
        System.out.println(teacher1.hashCode());
        System.out.println(teacher2.hashCode());
        System.out.println(teacher1.equals(teacher2));

    }
}
