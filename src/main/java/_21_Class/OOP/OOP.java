package _21_Class.OOP;

import _21_Class.Person.Person;

public class OOP {
    public static void main(String[] args) {
        //OOP => Object Oriented Programing
        //객체 지향 프로그래밍
        // - 현실 세계의 개념을 코드로 표현
        // - 사람, 동물, 자동차 하나의 객체로 보는 것
        // - 상태(속성)과 동작(기능)을 중심으로 프로그래밍
        //클래스는 설계 도면, 그 설계 도면으로 만들어낸 것이 객체, 만들 때 사용되는 것이 속성

        //OOP의 원칙
        //1. 추상화: 복잡한 내부 동작은 감추고, 꼭 필요한 기능만 보여주는 것
        //자동차를 예를 들면, 자동차가 시동이 걸리는 과정, 엔진이 돌아가는 과정을 다 감추고
        //그냥 시동이 걸리고 엔진이 돌아간다는 것을 확인시켜줌

        //2. 캡슐화: 정보 은닉
        //데이터(변수)를 보호하고, 접근을 제한하여 안정성을 높임

        //3. 상속
        //4. 다형성

        Person person = new Person();
        System.out.println(person.name);
//        System.out.println(person.age);
//        System.out.println(person.address);

    }
}
