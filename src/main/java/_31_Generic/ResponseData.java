package _31_Generic;

import lombok.AllArgsConstructor;
import lombok.Data;

//제네릭(Generic) / <>
//클래스나 메서드가 다룰 데이터 타입을 미리 명시하여 재사용성과 유연성을 높이는 기술
//타입 매개변수 (Type Parameter)
//클래스나 메서드에서 사용할 실제 타입을 '대신하여' 사용하는 매개변수
//일반적으로 알파벳 대문자 하나로 표기
//T(Type) - 일반적으로 클래스 타입을 나타낼 때 사용 (int, double은 불가능, String은 가능)
//E(Element) - 컬렉션의 요소(element)를 나타낼 때 사용
//K(Key) -  Map의 Key를 나타낼 때 사용
//V(Value) - Map의 Value를 나타낼 때 사용
//Generic 사용의 장점
//1. 다양한 자료형에 대해 하나의 클래스나 메서드를 정의할 수 있음 -> 재사용 증가, 중복을 감소
//2. 타입의 안정성 증가 -> 컴파일시 타입을 체크, 잘못된 타입이 들어갈 수 없음
@Data
@AllArgsConstructor //모든 변수를 생성자로 받음
public class ResponseData<T> { //여러가지 형태를 담을 수 있는 클래스
    private String message;
    private T data;
//    private String data1;
//    private int data2;
//    private double data3;
//

    @Override
    public String toString() {
        return message + data;
    }

//    public String toStringStr() {
//        return message + data1;
//    }
//
//    public String toStringInt(){
//        return message + data2;
//    }
//
//    public String toStringDouble() {
//        return message + data3;
//    }
}
