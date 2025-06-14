package _35_Lambda;

//람다식은 단일 메소드만 가지는 인터페이스 (-> 함수형 인터페이스)
//구현해야 할 메소드가 하나만 정의된 인터페이스
//@FunctionalInterface 어노테이션을 사용하면 컴파일 시에 단일 메소드인지 확인
@FunctionalInterface
public interface Calculator {
    int calculate(int a, int b);

}
