package _25_Casting.Control;

public class SmartPhone implements Power{

    @Override
    public void on() {
        System.out.println("스마트폰의 전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("스마트폰의 전원을 끕니다.");
    }

    public void sendKakaotalk(){
        System.out.println("스마트폰으로 카톡을 보냅니다.");
    }
}
