package _23_Abstraction;

public class Main {
    public static void main(String[] args) {
        PhoneFactory phoneFactory = new PhoneFactory("애플");
        phoneFactory.setName("삼성");
        phoneFactory.produce("아이폰 16");
        phoneFactory.manage();
        phoneFactory.displayInfo();


        Factory factory = new Factory("애플") {
            @Override
            public void produce(String model) {
                System.out.println(getName() + " 잠깐 만들어진 익명 클래스가 무언가를 생성합니다.");
            }

            @Override
            public void manage() {
                System.out.println(getName() + " 잠깐 만들어진 익명 클래스가 공장을 관리합니다.");
            }
        };
        factory.manage();
        factory.produce("스마트폰");

        //익명 클래스 => 추상 클래스의 객체처럼 보이지만, 자식 클래스를 즉석에서 임시로 만들어 객체를 생성한 것
        //재사용 하지 않으며 한 번만 쓰고 버릴 의도로 익명 클래스를 사용
        //즉, 임시로 만들어진 이름 없는 자식 클래스
        //때문에 추상 클래스의 객체가 생성된 것이 아니기 때문에 추상 클래스의 개념에 위배되지 않음

        System.out.println();
        TabletFactory tabletFactory = new TabletFactory("Apple");
        tabletFactory.produce("아이패드 6세대");
        tabletFactory.manage();
        tabletFactory.produce("아이패드 7세대");

    }
}
