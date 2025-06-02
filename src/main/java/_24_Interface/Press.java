package _24_Interface;

public interface Press {
    //Interface: 인터페이스는 클래스가 아니고, 기능(메소드)의 명세(규칙, 약속)만 정의하는 틀
    //추상 클래스는 단일 상속만 가능하지만, 인터페이스는 다중 상속이 가능
    //모든 변수는 public static final(상수) -> 이때 상수 선언은 전부 다 대문자
//    String NAME = "button";
    //객체 생성 불가, 생성자 없음
    //사용하는 경우
    //1. 기능 중심 설계를 하고 싶을 때 2. 여러 클래스에서 같은 행동(메소드)을 다르게 구현하고 싶을 때

    void onPressed(); //앞에 abstract가 생략되어 있음

}
