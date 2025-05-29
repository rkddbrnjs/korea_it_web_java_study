package _17_Method;

public class Parameter {
    public static void power(int number) {
        //거듭제곱을 하는 메소드
        //매개변수를 전달 받아서 해당 매개변수를 거듭제곱
        int result = number * number;
        System.out.println(number + "의 2승은" + result + "입니다");
    }

    public static void powerByExp(int number, int exponent){
        int result = 1;
        for(int i=0; i < exponent; i++){
            result *= number;
        }
        System.out.println(number + "의" + exponent +"승은" + result +"입니다");
    }
    //평균 구하기
    public static void average(int number1, int number2, int number3){
        int getAvg = (number1 + number2 + number3)/3;
        System.out.println(number1 + "과" +number2 + "과"+ number3 + "의 평균은"+ getAvg + "입니다.");
    }
    //홀수 짝수 판별하기
    public static void isEven(int num1){

        String number = (num1 % 2 == 1) ? "홀수" : "짝수";
        System.out.println(num1 + "은" +number + "이다");
    }
    public static void main(String[] args) {
        //Parameter
        //매개변수, 전달값
        average(80,90,100);
        power(6);
        powerByExp(3,3);
        isEven(6);
    }

    //세개의 정수를 전달하여 평균을 출력하는 메소드

    //정수를 전달하여 짝수인지 홀수인지 판별하는 메소드
    //단, 삼항연산자를 쓸 것
    //isEven(2);
}
