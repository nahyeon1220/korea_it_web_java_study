package _28_Static;

public class PrintNum {
    private int num = 10;
    //객체가 생성되어야만 클래스 변수가 됨. 때문에 현재는 인스턴스 수준 즉, 멤버변수

    public static void printNum() {
//        System.out.println(num);
    }
    //num은 객체가 있어야 하는데, printNum()은 객체 없이 호출되므로 num에 접근 불가능
}
