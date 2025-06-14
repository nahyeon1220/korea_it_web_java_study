package _35_Lambda;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Supplier;

//람다식(Lambda Expression)
//Java 8에서 도입된 '함수형 프로그래밍'을 지원하기 위한 표현식
//익명 클래스를 사용해 함수처럼 동작하는 코드
//-> 익명 함수
public class Main {
    public static void main(String[] args) {
        //할 일 목록
        //run() 메소드밖에 없음
        Runnable job1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("익명 클래스 방식");
            }
        };
        job1.run();

        Runnable job2 = () -> System.out.println("람다 방식");
        job2.run();

        //람다식이 등장한 배경
        //람다식이 나오기 전에는 함수형 프로그래밍을 하기 위해 익명 클래스를 주로 사용
        //익명 클래스 방식은 코드가 길어지고, 불필요한 반복이 많아질 수 있음. -> 가독성 저하

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) { //object인 o1과 o2의 크기를 비교
                return o1.compareTo(o2);
            }
            //두 객체 중 만약 앞의 객체가 더 작다면 음수, 같으면 0, 더 크다면 양수를 반환
        };
        System.out.println(comparator.compare(10,20));

        Comparator<Integer> comparator1 = ((o1, o2) -> o1.compareTo(o2));
        System.out.println(comparator1.compare(20,20));

        //람다식의 장점
        //코드 간결화
        //표현력 향상

        //람다식의 단점
        //디버깅의 어려움
        //재사용성의 낮음 -> 코드가 한줄이 아니고 여러줄로 늘어났을 때, 결국 익명 클래스에서 수정을 해야함

        //주요 함수형 인터페이스 -> 메소드가 하나만 있는 인터페이스
        //Supplier - T get();
        //매개변수 없이 값을 반환하는 인터페이스, 단순히 값을 '공급'하는 역할
        //Consumer - void accept(T t);
        //값을 매개변수로 받아서 사용하고, 아무것도 반환하지 않는 인터페이스, 데이터를 '소비'하는 역할
        //Function<T, R> - R apply(T t); -> T는 매개변수, R은 리턴 타입
        //하나의 매개변수를 받아서 연산을 수행한 후 결과를 리턴함
        //Predicate - boolean test(T t);
        //하나의 매개변수를 받아서 특정 조건을 검사한 후 true / false 를 리턴

        //1. Supplier
        Supplier<String> stringSupplier = () -> "Hello, World";
        //Consumer
        Consumer<String> stringConsumer = (message) -> System.out.println("메세지: " + message);
        String message = stringSupplier.get();
        stringConsumer.accept(message);
    }
    //익명 클래스: 즉석에서 해당 클래스나 인터페이스의 메소드를 재정의해서 사용
    //익명 클래스는 메소드가 하나일 수도 있고, 여러 개일 수도 있음
    //람다식 -> 메소드가 하나만 있는 인터페이스를 재정의해서 사용할 때의 표현식
    //() -> 한줄코드;
    //() -> {
    //      여러줄 코드
    // };
}
