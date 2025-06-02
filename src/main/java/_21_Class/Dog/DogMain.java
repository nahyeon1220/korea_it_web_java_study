package _21_Class.Dog;

public class DogMain {
    public static void main(String[] args) {
        //객체 생성하는 방법
        Dog dog = new Dog(); // -> 하나의 객체가 생성됨

        //생성된 해당 객체 속성 값 대입 또는 변경
        dog.name = "방울이"; //방울이 라는 이름을 대입
        dog.age = 3;

        dog.name = "호두"; //방울이에서 호두라는 이름으로 변경, 수정

        System.out.println(dog.age);
        System.out.println(dog.name);

        //생성된 객체 메소드 호출
        dog.bark(); //ctrl 누르고 bark 누르면 바로 메소드로 이동
        dog.sleep();

        //Student 라는 패키지 만들고 안에 Student와 StudentMain 생성
        //이름, 나이, 이메일, 주소 변수 생성
        //메소드 showInfo() => 정보 출력
        //StudentMain에서 객체 생성 후 나의 정보 입력 (주소는 대충...~)
        //showInfo() 호출해서 정보 출력

    }
}
