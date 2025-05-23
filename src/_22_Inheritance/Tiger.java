package _22_Inheritance;

public class Tiger extends Animal{

    /*
        super는 부모에게 접근할 수 있는 키워드
        즉, 자식 클래스에서 "부모님 기능 또는 속성" 접근할 때 사용
        super 키워드의 사용 방식
        1. super(): 부모 클래스의 생성자를 호출하는 키워드
        만약, 기본 생성자라면 () 안에 아무런 값이 없음 / 매개변수 생성자라면 () 안에 매개변수가 포함
        2.
     */

    //Tiger는 Animal에게 상속받아 Animal이 가지고 있는 속성과 메소드를 그대로 받음
    //Animal: 부모 클래스 = 슈퍼 클래스
    //Tiger: 자식 클래스 = 서브 클래스
    //이때, 부모클래스에는 없는 속성을 따로 추가할 수 있음

    private boolean isStriped;

    public Tiger() {
        System.out.println("속성이 정해져있지 않은 호랑이 객체 생성");
    }

    public Tiger(int animalAge, String animalName, boolean isStriped) {
        super(animalAge, animalName);
        this.isStriped = isStriped;
        System.out.println("모든 속성값이 부여된 호랑이 객체 생성");
    }

    public boolean isStriped() {
        return isStriped;
    }

    public void setStriped(boolean striped) {
        isStriped = striped;
    }

}
