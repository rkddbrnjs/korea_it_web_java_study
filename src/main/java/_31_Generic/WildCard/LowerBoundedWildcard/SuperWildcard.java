package _31_Generic.WildCard.LowerBoundedWildcard;

public class SuperWildcard {
    //하한 경계 와일드카드 : Dog 또는 Dog의 상위 타입만 허용한다.
    public static void putDog(Box<? super Dog> box) {
        box.setItem(new Dog()); //쓰기는 가능, 읽기는 안됨
//        Dog dog = box.getItem(); //읽기는 안됨

        Object obj = box.getItem(); //클래스의 가장 상위버전, 읽을 수는 있지만 object로 반환됨

        System.out.println("obj: " + obj);
    }
}
