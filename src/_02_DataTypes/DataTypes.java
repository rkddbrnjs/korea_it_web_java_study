package _02_DataTypes;

public class DataTypes {
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println(123);

        //변수
        //자료형 변수명 = 데이터;
        //정수 - int, long
        int num = 123;
        int num1;
        num1 = 234;
        num1 = 456;

        System.out.println("num1은" + num1);

        long l = 1_000_000_000_000_000L;
        System.out.println("l은" + l);

        //실수 - float, double
        float f = 3.14f;
        double d = 3.141123456123456;

        //문자 - char
        char a = 'a';
        char b = 'b';
        System.out.println("" + a + b);

        //문자열 - String
        String str = "안녕하세요";
        System.out.println(str);

        //논리 자료형 - boolean
        boolean isEmpty;
        isEmpty = true;
        isEmpty = false;

        System.out.println(isEmpty);

        int num2 = 25;
        String str2 = "강유권";
        String str3 = "운동";
        String mbti = "ISFP";
        System.out.println("제 이름은 " + str2 + " 입니다." + "제 나이는 " + num2 + " 살이고");
        System.out.println("취미는 " + str3 + " 입니다.");
        System.out.println("제 mbti는 " + mbti + "입니다.");

    }
}
