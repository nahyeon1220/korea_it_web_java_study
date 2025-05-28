package _25_Casting.Control;

public class CentralControl {

    private Power[] deviceArray;
    //tv, computer, speaker, smartphone, ledlight, mouse가 전부 power를 상속 받았기 때문에 Power로 배열을 생성

    public CentralControl(Power[] deviceArray) {
        this.deviceArray = deviceArray;
    }

    public void addDevice(Power device) { // => 암시적으로 업캐스팅

        int emptyIndex = checkEmpty();

        if(emptyIndex == -1){
            System.out.println("더이상 장치를 추가할 수 없습니다.");
            return; //메소드 빠져나오기
        }

        deviceArray[emptyIndex] = device;
        System.out.println(device.getClass().getSimpleName() + " 장치가 연결되었습니다.");
        // => (클래스명) 장치가 연결되었습니다. 출력
        //System.out.printIn(device + "장치를 연결되었습니다.); => (메모리주소) 장치가 연결되었습니다. 라고 출력
        //System.out.printIn(device.getClass() + "장치를 연결되었습니다.); => (패키지명) 장치가 연결되었습니다. 출력

    }

    public int checkEmpty(){
        for (int i = 0; i < deviceArray.length; i++) {
            if (deviceArray[i] == null) {
                return i; //빈자리 찾았을 때
            }
        }
        return -1; //다 차있을 때, 배열의 인덱스에서는 -1이 잘 없기 때문에 -1이라고 표현
    }

    public void powerOn() {
        for (Power device : deviceArray) {
            if(device == null){
                System.out.println("장치가 등록되어 있지 않은 슬롯입니다.");
                continue;
            } else {
                device.on();
            }

        }
    }

    public void powerOff() {
        for (int i = 0; i < deviceArray.length; i++) {
            if (deviceArray[i] == null){
                System.out.println("장치가 등록되어 있지 않은 슬롯입니다.");
                continue;
            }
            deviceArray[i].off();
        }
    }

    public void performSpecificMethod() {
        for (Power device : deviceArray){
            if (device instanceof Computer){
                Computer computer = (Computer) device;
                computer.manage();
            } else if (device instanceof Mouse){
                Mouse mouse = (Mouse) device;
                mouse.PressButton();
            } else if (device instanceof Speaker) {
                Speaker speaker = (Speaker) device;
                speaker.ControlSpeaker();
            } else if (device instanceof LEDLight) {
                LEDLight ledLight = (LEDLight) device;
                ledLight.changeColor();
            } else if (device instanceof SmartPhone) {
                SmartPhone smartPhone = (SmartPhone) device;
                smartPhone.sendKakaotalk();
            } else if (device instanceof Tv) {
                Tv tv = (Tv) device;
                tv.changeChannel();
            }

        }
    }
}
