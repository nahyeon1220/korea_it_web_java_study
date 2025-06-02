package _25_Casting.Control;

public class Main {
    public static void main(String[] args) {
        //Power 인터페이스 -> on(), off()
        //TV 클래스 -> 재정의하고 고유 메소드 1개
        //Computer, Speaker, LEDLight, Mouse, SmartPhone

        //방법 1.
//        Power[] powers= new Power[5];
//        CentralControl centralControl = new CentralControl(powers);

        //방법 2.
//        Power[] powers = {new Computer(), new Mouse(), new Tv()};
//        CentralControl centralControl = new CentralControl(powers);

        //방법 3.
        CentralControl centralControl = new CentralControl(new Power[5]);

        centralControl.addDevice(new Computer());
        centralControl.addDevice(new Tv());
        centralControl.addDevice(new Mouse());
        centralControl.addDevice(new Speaker());
        centralControl.addDevice(new LEDLight());
        centralControl.addDevice(new SmartPhone());

        System.out.println();

        centralControl.powerOn();

        System.out.println();

        centralControl.powerOff();

        System.out.println();

        centralControl.performSpecificMethod();

    }
}
