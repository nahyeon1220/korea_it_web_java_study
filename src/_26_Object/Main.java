package _26_Object;

public class Main {
    public static void main(String[] args) {
        //모든 클래스는 Object를 상속 받고 있다.

        Teacher teacher1 = new Teacher("오나현", "코리아IT");
        Teacher teacher2 = new Teacher("오나현", "코리아IT");
        System.out.println(teacher1.toString()); //toString()은 생략 가능
        System.out.println(teacher1);


        //equals로 true을 출력하고 싶다면 hashCode가 같아야 함.
        //하지만 teacher1과 teacher2의 hashCode가 각각 달라서 false가 나옴
        System.out.println(teacher1.hashCode());
        System.out.println(teacher2.hashCode());
        System.out.println(teacher1.equals(teacher2)); //equals와 hashCode는 실과 바늘처럼 거의 한 세트
    }
}
