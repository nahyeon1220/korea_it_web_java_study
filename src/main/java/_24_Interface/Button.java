package _24_Interface;

//extends -> 단일 상속 (클래스, 추상 클래스)
//Implements -> 다중 상속 (인터페이스)
public abstract class Button implements Press, Up, Down{

//Press, Up, Down 모두 추상 메소드를 가지고 있는 인터페이스이기 때문에 오버라이드(재정의)를 해주어야 함!


    @Override
    public void onDown() {

    }

    @Override
    public abstract void onPressed();
    //무조건 재정의 해준다. -> 추상화 시켜준다.
    //왜?
    //전원 버튼 => onPressed()
    //볼륨 업 => onPressed(), onUp()
    //볼륨 다운 => onPressed(), onDown()
    //채널 업 => onPressed(), onUp()
    //채널 다운 => onPressed(), onDown()
    //모든 클래스에서 전부 다 onPressed()라는 기능을 필수로 가지고 있기 때문에 추상화를 해서 재정의(오버라이드)를 해줘야 함


    @Override
    public void onUp() {

    }
}
