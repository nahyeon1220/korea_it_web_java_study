package _22_Inheritance;

public class Main {
    public static void main(String[] args) {

        //상속: 기존 클래스(부모 클래스)의 속성과 기능(메소드)을 새로운 클래스(자식 클래스)가 물려받음
        //왜 상속을 해야할까?
        //1. 코드의 재사용성
        //2. 계층 구조 설계를 가능하게 해주는 핵심 개념
        //3. 유지 보수 즉, 공통 기능이 한 곳(부모 클래스)에 있으므로, 수정할 일이 생기면 부모클래스 하나만 고치면 자식클래스에도 반영됨
        //4. 기존의 클래스를 수정하지 않고도 새로운 기능을 가진 자식 클래스를 추가할 수 있음
        //=> 개방 폐쇄 원칙: OOP의 4대 원칙을 지키기 위한 가이드인 솔리드 라는 5가지의 원칙 중 하나로, 확장에는 열려있고 수정(변경)에는 닫혀있음

        //상속을 하게 되면
        //자식 클래스는 부모의 코드를 그대로 사용
        //자식 클래스는 부모의 코드를 그대로 사용하거나, 필요한 기능을 또 추가하거나
        //부모의 코드(클래스)를 변경 가능 => 오버라이딩

        Animal animal1 = new Animal();
        animal1.setAnimalName("고양이");
        animal1.setAnimalAge(2);
        animal1.move();

        Tiger tiger1 = new Tiger();
        tiger1.setAnimalName("호랭이");
        System.out.println(tiger1.getAnimalName());
        tiger1.setAnimalAge(3);
        System.out.println(tiger1.getAnimalAge());
        tiger1.move();
        tiger1.hunt();
        tiger1.setStriped(true);

        Tiger tiger2 = new Tiger(3, "백호", false); //객체의 생성과 동시에 속성값을 대입

        System.out.println("여기부터는 Human");
        System.out.println();

        Human human1 = new Human("오나현", 23);
        System.out.println(human1.getAnimalName());
        System.out.println(human1.getAnimalAge());
        human1.move();
        human1.read("어린왕자");

    }
}
