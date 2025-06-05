package _34_Exception;

import java.util.Scanner;

public class DivideException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("입력할 정수 두개를 입력하세요");
        int a = scanner.nextInt();
        scanner.nextLine();
        int b = scanner.nextInt();
        try {
            int result = a/b ;
            System.out.println("a/b는" + result);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }finally {
            System.out.println("프로그램 정상 종료");
        }
    }
}
