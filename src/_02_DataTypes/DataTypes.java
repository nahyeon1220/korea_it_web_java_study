package _02_DataTypes;

public class DataTypes {
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println(123);

        //변수
        //자료형 변수명 = 데이터;
        //정수 - int, long

        int num = 123;
        int num1;
        num1 = 234;
        num1 = 456;

        System.out.println("num1은" + num1);

        //long을 사용할 때는 값 뒤에 대문자 L을 적어줘야 변수의 자료형이 long임을 인식
        //long을 사용할 때 값에 언더바를 삽입해도 출력과 출력값에는 아무 문제가 없음
        long l = 1_000_000_000_000L;
        System.out.println("long은" + l);

        //실수 - float, double
        //float를 사용할 때는 값 뒤에 소문자 f를 적어줘야 변수의 자료형이 float임을 인식
        //실수에서는 부동 소수점 오류가 일어날 수도 있음! 특히 전공자 면접에서는 중요한 질문일 수 있으니 공부해두기.
        float f = 3.14f;
        double d = 3.14123456123456;

        //문자 - char
        //여기서 큰 따옴표는 문자열로 인식, 작은 띠옴표는 문자로 인식
        char a = 'a';
        char b = 'b';
        System.out.println(a + b); //이렇게 출력하면 195가 나오는 이유: 아스키코드의 값으로 출력
        System.out.println("" + a + b); //이렇게 출력하면 ab가 나오는 이유: 제일 앞의 큰따옴표가 문자로 인식

        //문자열 - String
        //String은 자료형이 아니라 자바의 클래스, 자바의 기능
        String str = "안녕하세요";
        System.out.println(str);

        //논리 자료형 - boolean
        boolean isEmpty;
        isEmpty = true;
        isEmpty = false;

        System.out.println(isEmpty);

        //장문주석: ctrl + shift + /

        /*
        * 제 이름은 *** 입니다. 제 나이는 **살이고
        * 취미는 ***입니다.
        *
        * */

        String name = "오나현";
        int age = 23;
        String hobby = "운동";
        String mbti = "istp";

        System.out.print("제 이름은 " + name + " 입니다." );
        System.out.println(" 제 나이는 " + age + "살이고");
        System.out.print("취미는 " + hobby + "입니다.");
        System.out.println("제 mbti는 " + mbti + "입니다.");





    }
}

