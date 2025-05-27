package _24_Interface;

public class PowerButton extends Button{
    private boolean status;


    @Override
    public void onPressed() {
        if (status){
            status = false;
            System.out.println("전원을 끕니다.");
        } else {
            status = true;
            System.out.println("전원을 켭니다.");
        }
        //Button 클래스에서 onPressed를 이미 오버라이드가 되어있기 때문에,
        // 한 번 더 추상 메소드로 만들어줬고 그로 인해 Button 이라는 클래스도 추상 클래스로 만들어줌
        //때문에 Button 클래스를 상속 받기 위해서는 PowerButton의 클래스에서 onPressed를 한 번 더 재정의해줘야 함.
    }
    ;
}
