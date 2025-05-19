package _09_For;

public class For {
    public static void main(String[] args) {
        //반복문 - for
        // for (선언; 조건; 증감) {
        //      반복될 코드
        // }

//        for (int i = 0; i < 10; i++) {
//            System.out.println( "안녕" + i );
//        }

//        //자동 완성 fori = for (int i = 0; i < ; i++) { }
//        for (int i = 0; i < 50 ; i++) {
//            System.out.println("ㅎㅇ");
//        }

        //1 ~ 10까지 출력, 짝수만 출력.

        //첫번째 방법, if 조건문과 함께 사용
        for (int i = 1; i < 11 ; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }

        //두번째 방법
        for (int i = 2; i <= 10 ; i+= 2) {
            System.out.println(i);
        }

        //10 ~ 1까지 거꾸로 출력
        for (int i = 10; i >= 1 ; i--) {
            System.out.println(i);
        }

        // 1~100 까지 다 더한 값을 출력
        int sum = 0;
        for (int i = 1; i <= 100 ; i++) {
            sum += i;
        } System.out.println(sum);
    }
}
