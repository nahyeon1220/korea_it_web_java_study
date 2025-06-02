package _21_Class.Person;

public class Person {

    public String name;
    protected int age;
    String address;
    private String id;

    //접근 제어자 = 접근 지정자
    //public: 어디서든 접근 가능, 다른 클래스에서 접근 가능
    //default: 같은 패키지 안에서만 접근 가능 (명시를 따로 하지 않으면 default로 설정 됨)
    //protected: 같은 패키지 또는 자식 클래스에서만 접근 가능
    //private: 해당 클래스 내부에서만 접근 가능 -> 정보 은닉을 위해 사용

}
