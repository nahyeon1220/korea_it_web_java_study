package _06_String;

public class EscapeSequence {
    public static void main(String[] args) {
        //특수문자, 이스케이프 문자
        // \n, \t, \\, \", \'
        System.out.println("집에");
        System.out.println("너무");
        System.out.println("가고 싶어요");

        // \n : 줄바꿈 -> new line
        System.out.println("집에\n너무\n가고\n싶어요");

        // \t : tab -> space bar 4칸
        /*
            손흥민
            페이커
            방탄소년단
            블랙핑크
        */
        System.out.println("\t손흥민");
        System.out.println("\t페이커");
        System.out.println("\t방탄소년단");
        System.out.println("\t블랙핑크");

        // \\ : 역슬래쉬 1개
        // "C:\\Program Files\java"
        System.out.println("C:\\Program Files\\java");

        // \" : 큰 따옴표
        // 손흥민의 팀은 "토트넘 홋스퍼 FC"이다.
        System.out.println("손흥민의 팀은 \"토트넘 홋스퍼 FC\"이다");

        // \' : 작은 따옴표
        //페이커는 신이다.
        System.out.println("페이커는 \'신\'이다.");
        //문자열 안에서는 역슬래쉬를 굳이 안 붙여도 되지만, 다른 경우에서는 붙여줘야 함.

        //문제
        String id = "030122-4234567";
        //출력: 030122-1

        System.out.println(id.substring(0, id.indexOf("4") + 1));
        System.out.println(id.substring(0, 8));
        System.out.println(id.substring(0, id.indexOf("-") + 2));
    }
}
