package _21_Class.BankAccount;

public class BankAccountMain {
    public static void main(String[] args) {

    BankAccount bankAccount = new BankAccount();

    bankAccount.deposit(10000);
//    bankAccount.deposit(-4000);

    bankAccount.withdraw(2400);
//    bankAccount.withdraw(15000);
        System.out.println(bankAccount.getBalance());

        //문제
        //WaterBottle => WaterBottle 클래스, WaterBottleMain
        //currentWater: 현재 물의 양 -> 접근지정자는 private
        //메소드
        //물 채우기(fill) -> 최대 용량인 1000을 넘길 수 없음
        //물 마시기(drink) -> 현재 물의 양보다 초과해서 마실 수 없음
        //Getter를 통해 현재 물병의 물의 양을 확인
    }
}
