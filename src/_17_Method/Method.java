package _17_Method;

public class Method {
    public static void sayHello() {
        //sayHello라는 이름을 가진 메소드
        //안녕을 출력
        System.out.println("안녕");
    }

    public static void main(String[] args) {
        //메소드
        //기능을 담당하는 부분

        //메소드 호출
        System.out.println("메소드 호출 전");
        sayHello();
        System.out.println("메소드 호출 후");
        String name = "나현";
        System.out.println(name);
    }
}
