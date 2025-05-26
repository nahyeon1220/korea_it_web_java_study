package _23_Abstraction;

//abstract => 추상적인, 형태만 있는
//틀은 있지만 내용은 없는 클래스
//이 기능은 꼭 있어야하지만, 해당 기능 구현은 자식 클래스에서 실행
//객체 생성 불가

//사용하는 이유
//1. 설계 일관성, 확장성 확보 => 공통된 구조를 가진 자식 클래스들을 설계
//2. 오류 방지, 강제 구현 => 추상 메소드를 구현하지 않으면 에러가 발생 (필수 기능 구현)
//3. 코드 재사용성 => 공통된 메소드나 필드를 추상 클래스에 미리 작성 가능

public abstract class Factory {
    private String name; //필드, 멤버변수 선언

    //추상 클래스의 추상 메소드 -> 추상 메소드를 사용하기 위해서는 클래스도 추상 클래스여야함
    //추상 메소드가 하나라도 있으면 추상 클래스
    public abstract void produce(String model);
    public abstract void manage();

    public Factory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




    public void displayInfo() {
        System.out.println("공장 정보를 출력합니다. 공장 이름: " + name);
    }

}
