package _21_Class.BankAccount;

public class BankAccount {
    private int balance;

    BankAccount(){
        System.out.println("계좌가 개설되었습니다. 현재 잔액: " + balance + "원");
    }
    public void deposit(int amount){
        if (amount > 0) {
            balance += amount;
            System.out.println("계좌에" + amount + "원 입금되었습니다. 현재잔액:" + balance);
        }else {
            System.out.println("0원 이상만 입금 가능합니다.");
        }
    }
    public void withdraw(int amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("계좌에" + amount + "원 출금되었습니다. 현재잔액:" + balance);
        }else {
            System.out.println("잔액이 부족합니다.");
        }
    }

    //그럼 입금과 출금을 담당하는 메소드들은 setter와 같다고 할 수 있는가?
    //속성값을 변경한다는 관점으로 보면 그렇다 라고 할 수 있다.
    //다만 setter와 이러한 메소드들의 차이를 이해해야한다.
    //첫째로 setter는 값을 직접적으로 변경하고 있다. 입금 출금 메소드는 메소드 명에서 드러나듯이
    //행위에 중점을 둔다 => 값을 직접적으로 변경하고 있는게 아니라 값을 계산해서 변경
    //두번째는 setter는 검증 단계를 보통은 포함하지 않는다.
    //하지만 메소드는 보통은 검증 단계를 포함할 수 있다.

    public int getBalance() {
        return balance;
    }
    //문제
    //WaterBottle => WaterBottle 클래스, main 클래스 만들고
    //currentWater 현재 물의 양
    //메소드
    //물 채우기(fill) => 최대용량이 1000을 넘을수 없다.
    //물 마시기(drink) => 현재 물의 양보다 초과해서 마실 수 없다.
    //getter를 통해 현재 물병의 물의 양을 접근할 수 있다.

}
