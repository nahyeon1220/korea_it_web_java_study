package _25_Casting.Control;

public class LEDLight implements Power{

    @Override
    public void on() {
        System.out.println("LED 전구의 전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("LED 전구의 전원을 끕니다.");
    }

    public void changeColor(){
        System.out.println("LED 전구의 색상을 변경합니다.");
    }
}
