package _21_Class.Car;

public class Car {
    //자동차에 대한 정의
    String carName;
    int carYear;
    String carColor;


    //생성자
    Car() { //기본 생성자
        System.out.println("필드가 아무것도 정해지지 않은 껍데기 자동차");
        System.out.println("NoArgsConstructor");
    }

    Car(String carName) { //오버로딩이 이뤄진 상태 //일반적으로 매개변수명과 일치하게 사용
        System.out.println("CarModel의 속성값이 부여된 자동차");
        System.out.println("RequiredArgsConstructor");
        this.carName = carName; //생성과 동시에 이름을 입력
    }

    //this -> 해당 클래스로 만들어진 객체를 의미 (객체의 속성을 의미하는 도구)
    //왜 써야할까?
    //1. 해당 클래스로 만들어진 객체에 속성을 대입하기 위해 2. 속성의 이름과 매개변수의 이름이 같을 때 명확히 하기 위해
    //만약, 이름이 다르다면 this는 생략가능
    //carName = carName; 이라면 속성에 자기 자신을 대입하는 거라 의미가 없음 ★★★
    //하지만, this.carName 이라고 명시하면 속성에 매개변수 값 대입이라는 의미

    Car(String carName, int carYear, String carColor) {
        System.out.println("모든 속성값이 부여된 자동차");
        System.out.println("AllArgsConstructor");
        this.carName = carName;
        this.carYear = carYear;
        this.carColor = carColor;
    }

    public void startCar() {
        System.out.println(carName + " 시동 켜기");
    }

    public void drive() {
        System.out.println(carName + " 전진");
    }

    public void stopCar() {
        System.out.println(carName + "시동 끄기");
    }


}
