package _21_Class.BankAccount;

public class BankAccount {

    private int balance;
    //int -> null이 포함되지 않기 때문에 선언 후 값을 초기화하지 않으면 0이 출력됨
    //Integer -> null을 포함되어 있기 때문에 선언 후 값을 초기화하지 않으면 null이 출력됨

    BankAccount() {
        System.out.println("계좌가 개설되었습니다. 현재 잔액: " + balance + "원");
    }

    //입금과 출금을 담당하는 메소드들은 setter와 같을까?
    //관점의 차이
    //속성값을 변경한다는 관점 -> 그렇다. 다만, setter와 이러한 메소드들의 차이를 이해해야함.
    //차이점 1. setter는 값을 직접적으로 변경
    //(입금, 출금 메소드는 메소명에서 드러나듯이 행위에 중점 -> 값을 직접적으로 변경이 아닌 값을 계산해서 변경)
    //차이점 2. setter는 검증 단계를 보통은 포함하지 않지만, 메소드는 보통 검증 단계를 "포함할 수 있다" (꼭 포함은 아님)


    public void deposit(int amount) {
        if (amount > 0 ){
            balance += amount;
            System.out.println("계좌에 " + amount + "원이 입금되었습니다. 현재 잔액: " + balance);
        } else {
            System.out.println("0원 이상만 입금 가능합니다.");
        }

    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("계좌에서 " + amount + "원이 출금되었습니다. 현재 잔액: " + balance);
        } else {
            System.out.println("잔액이 부족합니다. 현재 잔액: " + balance + "원");
        }


    }
}
