package _19_VariableScope;

public class VariableScope {
    public static void methodA() {
        String str = "abc";
    }
    public static void main(String[] args) {
        String name = "오나현"; //main의 안에 있기 때문에, 지역변수

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        //여기서 i의 값을 사용할 수 없음. i는 for문 안에 있는 지역변수
    }
}
