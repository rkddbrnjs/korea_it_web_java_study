package _34_Exception;

import java.util.Scanner;

class AgeFailedException extends Exception{
    public AgeFailedException(String message){
        super(message);
        System.out.println("예외가 발생했습니다.");
    }
}

public class SignUpException {
    public static void join(String name, int age) throws AgeFailedException{
        if (age < 14){
            throw new AgeFailedException("14세 미만은 가입할 수 없습니다.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름과 나이를 입력하세요: ");
        String myName = scanner.nextLine();
        int myAge = scanner.nextInt();
       try{
           join(myName, myAge);
           System.out.println(myName+ "님 가입이 완료되었습니다.");
       }catch (AgeFailedException e){
           System.out.println(e.getMessage());
       }


    }
}
