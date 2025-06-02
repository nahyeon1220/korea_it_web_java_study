package _25_Casting.Control;

public class Computer implements Power{


    @Override
    public void on() {
        System.out.println("컴퓨터의 전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("컴퓨터의 전원을 끕니다.");
    }

    public void manage(){
        System.out.println("컴퓨터를 조작합니다.");
    }
}
