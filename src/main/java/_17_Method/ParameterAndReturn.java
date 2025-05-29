package _17_Method;

public class ParameterAndReturn {
//    public static int power(int number) {
//        //거듭제곱을 하는 메소드
//        //매개변수를 전달 받아서 해당 매개변수를 거듭제곱
//        int result = number * number;
//        return result;
//    }
    public static int getPower(int number){
        int result = number * number;
        return result;
        //return number * number; 도 가능
    }
//    public static void powerByExp(int number, int exponent){
//        int result = 1;
//        for(int i=0; i < exponent; i++){
//            result *= number;
//        }
//        System.out.println(number + "의" + exponent +"승은" + result +"입니다");
//    }
    public static int getPowerByExp(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }
    public static int getStr(String str){
        int strLength = str.length();
        return strLength;
    }
    public static void main(String[] args) {

        System.out.println(getPower(3));
        System.out.println(getPowerByExp(3,4));
        System.out.println(getStr("안녕하세요 반갑습니다."));
    }
    //문자열을 매개변수로 전달하고 해당 문자열의 길이를 반환받아서 출력
}
