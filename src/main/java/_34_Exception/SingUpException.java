package _34_Exception;

//1. SingUp이라는 메소드 먼저 생성
//2. 새로운 class 생성 후 extends Exception
//3. if문으로 예외 발생
//4. throws AgeException 추가
//5. try - catch - finally 구문 작성



class AgeException extends Exception{
    public AgeException(String message){
        super(message);
    }
}

public class SingUpException {

    public static void SingUp(String name, int age) throws AgeException{
    if (age < 14){
        throw new AgeException("14세 미만은 가입할 수 없습니다.");
    }
        System.out.println(name + "님 회원가입이 완료되었습니다.");
    }

    public static void main(String[] args) {
        String name = "홍길동";
        int age = 12;

        try {
            SingUp(name, age);
        } catch (AgeException e) {
            System.out.println("회원가입 실패: " + e.getMessage());
        } finally {
            System.out.println("회원가입 종료");
        }


    }
}
