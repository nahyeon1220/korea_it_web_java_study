package _06_String;

public class String02 {
    public static void main(String[] args) {
        String str = "I like music and movie and travel.";

        System.out.println(str.replace(" and", ",")); //특정 문자열 전부를 다른 문자열로 대체
        System.out.println(str.substring(7)); //인덱스 기준 7부터 끝까지 출력
        System.out.println(str.substring(7,12)); //인덱스 기준 7부터 11까지 출력, 끝지점은 본인 포함 X
        System.out.println(str.indexOf("movie"));
        System.out.println(str.substring(str.indexOf("movie"), str.indexOf(".")));

        str = "    I want to go home     ";
        System.out.println(str.trim()); //문자열 앞뒤 공백 제거

        String s1 = "Hello";
        String s2 = "World";

        System.out.println(s1 + s2);
        System.out.println(s1.concat(s2)); //문자열 이어붙이기 -> s1 뒤에 s2 을 이어붙임
        System.out.println(s1 + " " + s2);
        System.out.println(s1.concat(" ").concat(s2));

    }
}
