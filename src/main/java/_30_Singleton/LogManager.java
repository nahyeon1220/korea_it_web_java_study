package _30_Singleton;

public class LogManager {
    //싱글톤(Singleton)
    //애플리케이션 전체에서 단 하나의 인스턴스를 공유하도록 하는 패턴
    //자원을 공유할 때 사용 -> 설정 파일
    //싱글톤을 사용을 하게 되면, 객체를 여러 번 만들 필요가 없고 한 번만 만들어 재사용

    private static LogManager instance;
    //Static이 붙여졌기 때문에, 클래스 변수라 LogManager라는 자신의 객체를 붙일 수 있음

    private LogManager() {
        //생성자를 private로 막아서 외부에서 new를 금지 시킴
    }

    public static LogManager getInstance() {
        if (instance == null){ //정적 변수에 인스턴스가 있는지 확인
            instance = new LogManager(); //없다면 최초 1회 객체 생성
        }
        return instance; //있다면 정적 변수에 있는 객체 생성
    }

    public void log(String message) {
        System.out.println("LOG => " + message);
    }
}
