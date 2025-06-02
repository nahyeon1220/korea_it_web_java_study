package _21_Class.Car;

public class CarMain {
    public static void main(String[] args) {

        //밑에 있는 3줄은 다 다른 곳(메모리)에 할당되어 있음

        Car car1 = new Car();
        //얘는 괄호 안에 아무것도 안 적었기 때문에, 기본 생성자와 같음. 때문에 클래스에 기본 생성자의 출력값이 출력

        Car car2 = new Car("아반떼");

        Car car3 = new Car("싼타페", 2025, "White");

        car3.startCar(); //이것이 추상화, 우리는 메소드를 호출했을 뿐 어떤 과정으로 이뤄진지 모름
        car3.drive();
    }
}
