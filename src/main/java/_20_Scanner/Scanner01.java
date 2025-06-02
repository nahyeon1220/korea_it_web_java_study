package _20_Scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //Scanner => 입력
        Scanner scanner = new Scanner(System.in);
        //String 문자열 입력받기
        //next() => 토큰(공백 문자 = 띄어쓰기, 탭, 엔터) 단위로 인식
        //nextLine() => 엔터가 입력될 때까지 인식
        //유일하게 nextLine만 엔터가 입력될 때까지 인식이며, 나머지는 전부 다 토큰단위로 인식

//        String str1 = scanner.next();
//        String str2 = scanner.next();
//        System.out.println("str1은 " + str1);
//        System.out.println("str2는 " + str2);

//        String str3 = scanner.nextLine();
//        System.out.println("str3는 " + str3);
//        //중간에 공백 문자(스페이스)가 있음에도 불구하고 엔터가 입력될 때까지의 값을 출력
//
//        //int 정수 입력 받기
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//        System.out.println("num1은 " + num1);
//        System.out.println("num2는 " + num2);

//        int num = scanner.nextInt(); //123\n => 123
//        scanner.nextLine();
//        String str = scanner.nextLine(); //\n
//        System.out.println("num은 " + num + " str은 " + str);

        int age;
        String name;
        //두개 입력받고 출력

        System.out.print("나이: ");
        age = scanner.nextInt();

        scanner.nextLine();

        System.out.print("이름: ");
        name = scanner.nextLine();


        System.out.println("나이는 " + age + ", 이름은 " + name);


    }
}
