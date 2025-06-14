package _35_Lambda;

import java.util.Scanner;

//Main에서 정적 메소드로 execute 만들고 매개변수로 String input
//인터페이스 StringProcessor processor 두가지 받음
//return으로 processor.process(input);
//스캐너 객체 만들기
//람다식으로 구현 -> 모두 대문자로, 모두 소문자로, 접두사로 붙이기, 문자열 거꾸로
//스캐너로 영문 하나 입력 받고 4가지 실행 결과물 출력
public class StringProcessorMain {
    public static String execute(String input, StringProcessor processor){
        return processor.process(input);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringProcessor toUpper = s -> s.toUpperCase();
        StringProcessor toLower = s -> s.toLowerCase();
        StringProcessor addPrefix = s -> ">> " + s;
        StringProcessor reverse = s -> new StringBuilder(s).reverse().toString();

        String testString = scanner.nextLine();

        System.out.println("원본 문자열 : " + testString);
        System.out.println("대문자 변환 : " + execute(testString, toUpper));
        System.out.println("소문자 변환 : " + execute(testString, toLower));
        System.out.println("접두사 추가 : " + execute(testString, addPrefix));
        System.out.println("문자열 뒤집기 : " + execute(testString, reverse));
    }
}
