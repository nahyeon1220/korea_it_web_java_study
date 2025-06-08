package _34_Exception;

class LoginFailedException extends Exception {

    //예외 발생 2
    public LoginFailedException(String message){
        super(message);
        //예외 발생 3
        System.out.println("예외가 발생했습니다.");
    }

}

public class Exception02 {

    //throws: 메소드 내부에서 예외가 생겼을 때 자신이 처리하는 게 아닌 자신을 호출하는 곳에서 처리
    //try - catch - finally 쪽에서 처리
    public static void login(String id, String pw) throws LoginFailedException { //예외 발생 4
        String correctId = "admin";
        String correctPw = "1q2w3e4r";

        if (!id.equals(correctId) || !pw.equals(correctPw)) {
            //예외 발생 1
            throw new LoginFailedException("Id 또는 Pw를 잘못 입력하셨습니다.");
        }
    }

    public static void main(String[] args) {
        String inpudId = "admin";
        String inputPw = "1234qwer";

        try {
            login(inpudId, inputPw); //예외 발생 5
        } catch (LoginFailedException e){
            System.out.println("로그인 실패: " + e.getMessage()); //예외 처리 6
        } finally {
            System.out.println("프로그램 정상 종료");
        }



        }
    }

