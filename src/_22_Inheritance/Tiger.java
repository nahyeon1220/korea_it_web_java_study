package _22_Inheritance;

public class Tiger extends Animal{

    /*
        super는 부모에게 접근할 수 있는 키워드
        즉, 자식 클래스에서 "부모님 기능 또는 속성" 접근할 때 사용
        super 키워드의 사용 방식
        1. super(): 부모 클래스의 생성자를 호출하는 키워드
        만약, 기본 생성자라면 () 안에 아무런 값이 없음 / 매개변수 생성자라면 () 안에 매개변수가 포함
        2. super.메소드() or super.필드명(멤버변수): 부모 클래스의 메소드 또는 멤버변수에 접근
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
        super(animalName, animalAge);
        this.isStriped = isStriped;
        System.out.println("모든 속성값이 부여된 호랑이 객체 생성");
    }

    public boolean isStriped() {
        return isStriped;
    }

    public void setStriped(boolean striped) {
        isStriped = striped;
    }

    @Override //-> 어노테이션 =  시그니처 꼬리표?를 붙여줘야함
    //상속 관계에서 자식 클래스가 부모 클래스의 메소드를 재정의
    //부모로부터 물려받은 메소드를 자식이 '다르게' 실행하도록 바꾸는 것
    //부모 클래스의 메소드를 자식 클래스에서 동일한 이름, 매개변수, 리턴 타입으로 재정의
    //기능은 같은 동작을 하지만, 내용을 바꾸고 싶을 때 사용
    public void move() {
        super.move(); //부모의 메소드를 호출하기 위해 super를 명시
        System.out.println(getAnimalName() + "가 움직입니다.");
    }

    public void hunt() {
        System.out.println(getAnimalName() + "가 사냥을 합니다.");
        //왜 super를 쓰지 않을까?
        //상속과 메소드에서는 탐색 순서가 자식 클래스 -> 부모 클래스
        //자식 클래스에서 해당 메소드가 없다면 부모 클래스에서 찾아 호출
    }


}
