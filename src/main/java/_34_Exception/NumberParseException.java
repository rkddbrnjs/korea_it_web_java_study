package _34_Exception;

import java.util.Scanner;

public class NumberParseException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        String A = scanner.nextLine();

        System.out.println(A);

       try {
           int B = Integer.parseInt(A);
            System.out.println(A);
       }catch (NumberFormatException e){
           System.out.println("숫자가 아닌 값을 입력하셨습니다.");
       }finally {
           System.out.println("프로그램 정상 종료");
       }
    }
}
