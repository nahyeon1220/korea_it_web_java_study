package _25_Casting.Control;

public class Speaker implements Power{

    @Override
    public void on() {
        System.out.println("스피커 전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("스피커 전원을 끕니다.");
    }

    public void ControlSpeaker(){
        System.out.println("스피커의 볼륨을 조절합니다.");
    }
}
