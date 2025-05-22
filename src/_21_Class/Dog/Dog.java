package _21_Class.Dog;

public class Dog {
    //강아지들의 실체를 만들기 위한 틀, 설계 도면 - main이 없음 즉, 실행은 다른 곳에서 함

    //Dog 라는 클래스는 name과 age 라는 속성을 가져야 함.
    //클래스의 필드 -> 속성
    String name;
    int age;

    //Dog 라는 객체(실체)를 만들면 짖기와 잠자기 2가지의 기능을 사용 가능
    //클래스의 메소드 -> 기능
    //첫번째 기능: 짖기
    public void bark() {
        System.out.println("왈왈");
    }

    //두번째 기능: 잠자기
    public void sleep() {
        System.out.println("잠자기");
    }

}
