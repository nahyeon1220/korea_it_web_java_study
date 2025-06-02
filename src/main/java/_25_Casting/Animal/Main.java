package _25_Casting.Animal;

public class Main {
    public static void main(String[] args) {
        //업캐스팅
        //자식 클래스의 객체를 부모 클래스 타입으로 참조하는 것
        //즉, 자식 클래스의 인스턴스(객체)를 부모 클래스 타입의 변수에 저장하는 것
        //Java에서의 업캐스팅은 다형성을 구현하는 핵심 개념

        Dog d = new Dog();
        d.speak();
        d.wagTail();

        //업캐스팅 (자식 => 부모), 형변환 명시 안 해도 됨
        //방법 1. A a = new B();
        //a는 Animal 타입이지만, 내부적으로는 Dog의 객체가 들어있다.
        Animal a = new Dog();
        a.speak(); //동적 바인딩의 기능으로, 자식 클래스에서 먼저 찾게 되어 오버라이된 자식 메소드가 호출됨.
//        a.wagTail(); -> Animal을 참조하고 있고, Animal에는 wagTail이 없기 때문에 호출할 수 없음.
        //방법 2. 부모 클래스 타입에 자식 클래스 대입
        Animal a2 = d;
        a2.speak();

        //다운캐스팅 (부모 => 자식), 형변환 명시 필요
        //방법 1.
        ((Dog) a).wagTail(); //일시적 형변환
        //방법 2. 새로운 변수에 다운캐스팅한 객체를 대입
        Dog d2 = (Dog) a2;
        d2.wagTail();

        //다양한 자식들을 하나의 클래스 타입으로 처리할 수 있음
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        Dog[] dogs = {
                dog1,
                dog2,
                dog3
        };

        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal human = new Human();

        Animal[] animals = {
                dog,
                cat,
                human
        };

        for (Animal animal : animals) {
            animal.speak();
        }
    }
}
