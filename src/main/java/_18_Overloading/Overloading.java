package _18_Overloading;

public class Overloading {
    public static int getPower(int number){
        return number * number;
    }

    public static int getPower(double doubleNum){
        int number = (int) doubleNum;
        return number * number;
    }
    public static int getPower(String strNum){
        int number = Integer.parseInt(strNum);
        return number * number;
    }
    public static void printInfo(String name){
        System.out.println(name);
    }
    public static void printInfo(String name, int age){
        System.out.print(name + " ");
        System.out.println(age);
    }
    public static void printInfo(String name, int age, String email){
        System.out.print(name + " ");
        System.out.print(age + " ");
        System.out.println(email);
    }
    public static int add(int num1, int num2){
        return num1 + num2;
    }
    public static int add(double doubleNum1, double doubleNum2){
        int num1 = (int)doubleNum1;
        int num2 = (int)doubleNum2;
        return num1 + num2;
    }
    public static int add(String strNum1, String strNum2){
        int num1 = Integer.parseInt(strNum1);
        int num2 = Integer.parseInt(strNum2);
        return num1 + num2;
    }
    public static void main(String[] args) {
        //메소드 오버로딩
        //같은 이름의 메소드를 여러 개 선언
        //매개변수(파라미터)의 타입이 달라야한다 또는 갯수가 달라야한다.
        //리턴 자료형은 같아야한다.
        System.out.println(getPower(3));
        System.out.println(getPower(2.3));
        System.out.println(getPower("5"));

        printInfo("강유권");
        printInfo("강유권",25);
        printInfo("강유권",25,"rkddbrnjs@naver.com");

        System.out.println(add(1,2));
        System.out.println(add(2.0,3.0));
        System.out.println(add("2","3"));


        //문제
        //메소드 이름 printInfo()
        //문자열 이름만 전달 => 이름을 출력
        //문자열 이름, 정수 나이 전달 => 이름 나이 출력
        //문자열 이름, 정수 나이, 문자열 이메일 => 이름 나이 이메일 출력


        //메소드 이름 add()
        //int와 int의 덧셈
        //double과 double의 덧셈
        //문자열 숫자와 문자열 숫자의 덧셈

    }
}
