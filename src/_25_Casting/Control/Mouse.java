package _25_Casting.Control;

public class Mouse implements Power{

    @Override
    public void on() {
        System.out.println("마우스의 전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("마우스의 전원을 끕니다.");
    }

    public void PressButton(){
        System.out.println("마우스의 버튼을 누릅니다.");
    }
}
