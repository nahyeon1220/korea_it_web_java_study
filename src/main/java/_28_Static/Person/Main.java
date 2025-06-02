package _28_Static.Person;

public class Main {
    public static void main(String[] args) {
            Person person1 = new Person("홍길동");
            Person person2 = new Person("김춘향");

            System.out.println();

            person1.sayHello(); //인스턴스 메소드
            person2.sayHello();

            Person.showPopulation();
            //클래스 수준의 메소드 (=static, 객체 없이도 호출할 수 있다는 의미)
            //클래스 수준의 변수
    }
}
