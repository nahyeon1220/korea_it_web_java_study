package _29_Builder;

public class MemberLombokMain {
    public static void main(String[] args) {
        MemberLombok memberLombok = MemberLombok.builder()
                .age(23)
                .name("나현")
                .email("gmail")
                .build();
    }
}
