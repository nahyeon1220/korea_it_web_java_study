package _29_Builder;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member.Builder()
                .name("오나현")
                .age(23)
                .email("Gmail")
                .build();
    }
    //Build 방식을 이용했을 때의 이점
    //1. 가독성 증가
    //2. 매개변수의 순서를 지키지 않아도 됨
    //3. 유지보수성 향상 -> 필드 추가, 변경에 용이
}
