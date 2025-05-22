package _18_Overloading;

public class Overloading {

    public static int getPower(int number) {
        return number * number;
    }

    public static int getPower(double doubleNum) {
        int number = (int)doubleNum;
        return number * number;
    }

    public static int getPower(String strNum) {
        int number = Integer.parseInt(strNum);
        return number * number;
    }

    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void printInfo(String name){
        System.out.println("이름: " + name);
    }

    public static void printInfo(String name, int age) {
        System.out.println("이름: " + name + ", 나이: " + age);
    }

    public static void printInfo(String name, int age, String email){
        System.out.println("이름: " + name + ", 나이: " + age + ", 이메일: " + email);
    }

    public static void add(int num1, int num2){
        int result = num1 + num2;
        System.out.println(result);
    }

    public static void add(double num1, double num2){
        int Num1 = (int) num1;
        int Num2 = (int) num2;
        int result = Num1 + Num2;
        System.out.println(result);
    }

    public static void add(String str1, String str2){
        int strNum1 = Integer.parseInt(str1);
        int strNum2 = Integer.parseInt(str2);
        int result = strNum1 + strNum2;
        System.out.println(result);
    }

    public static void main(String[] args) {
        //오버로딩 (과 함께 나오는 개념은 오버라이딩)
        //메소드 오버로딩: 같은 이름의 메소드를 여러 개 선언
        //이때, 조건은 매개변수의 타입 또는 갯수가 달라야하며 리턴의 자료형은 같아야 함.
        System.out.println(getPower(3));
        System.out.println(getPower(2.3));
        System.out.println(getPower("4"));
        System.out.println(getPower(2,4));

        //문제
        //메소드 이름 printInfo()
        //문자열 이름만 전달 -> 이름 출력
        //문자열 이름, 정수 나이 전달 -> 이름 나이 출력
        //문자열 이름, 정수 나이, 문자열 이메일 -> 이름 나이 이메일 출력

        printInfo("나현");
        printInfo("나현", 23);
        printInfo("나현", 23, "nahyeon03122@gmail.com");

        //메소드 이름 add()
        //int와 int 덧셈
        //double과 double 덧셈
        //문자열 숫자와 문자열 숫자 덧셈

        add(1,2);
        add(2.3,3.4);
        add("234", "456");

    }
}
