package _05_Operator;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        //연산자

        //대입 연산자
        int num1 = 11;
        int num2 = 5;
        //여기서 = 은 해당 변수에 데이터(값)을 대입한다는 의미
//        수학적인 같다라는 의미가 아님

        //산술 연산자
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2); //몫
        System.out.println(num1 % num2); //나머지

        //복합 대입 연산자
        num1 += 5; // num1 = num1 + 5
        System.out.println(num1);
        num1 -= 5; // num1 = num1 - 5
        System.out.println(num1);
        num1 *= 2;
        System.out.println(num1);
        num1 /= 2;
        System.out.println(num1);
        num1 %= 2;
        System.out.println(num1);

        //증감 연산자
        int j = 10;
//        System.out.println(j);
        //실행된 후 1증가
//        System.out.println(j++);
//        System.out.println(j);
        //실행된 후 1 감소
//        System.out.println(j--);
//        System.out.println(j);
        //실행되기 전 1증가
//        System.out.println(++j);
        //실행되기 전 1 감소
//        System.out.println(--j);

        //비교 연산자 => 결과가 항상 boolean 참/거짓 둘 중 하나
        num1 = 5;
        num2 = 3;
        System.out.println(num1 > num2);
        System.out.println(num1 >= num2);
        System.out.println(num1 < num2);
        System.out.println(num1 == num2);
        System.out.println(num1 != num2);

        //논리 연산자 ( &, |, !)
        boolean flag1 = true;
        boolean flag2 = false;
        System.out.println(flag1 & flag2); //& and 논리급 => 하나라도 false가 있으면 false
        System.out.println(flag1 | flag2); //| or 논리합 => 하나라도 true가 있으면 true
        System.out.println(!flag1);

        //논리 연산자 조합 (&&, ||)
        //&& => 선 조건이 true일 때만 후조건을 실행한다. 선조건이 false이면 후조건을 실행하지 않는다.
        //|| => 선조건이 true이면 후조건을 실행하지 않는다. 선조건이 false일때만 후조건을 실행한다.
        System.out.println(flag1 && flag2);
        System.out.println(flag1 || flag2);

        //삼항 연산자
        int x = 5;
        int y = 3;
        int max = (x > y) ? x : y ;
        System.out.println(max);

        int min = (x < y) ? x : y ;
        System.out.println(min);

        x = 3;
        boolean isSame = (x == y) ? true : false;
        System.out.println(isSame);

        String sameStr = (x != y) ? "다름" : "같음";
        System.out.println(sameStr);

        /*
        * int height = 숫자;
        * 키가 120 이상인 경우 탑승 가능하도록 하는 삼항연산자
        * 가능하면 탑승 가능 불가능 하면 "탑승 불가능" 출력*/

        int height = 170;
        String heightStr = (height >= 120) ? "탑승 가능" : "탑승 불가능";
        System.out.println(heightStr);


    }
}
