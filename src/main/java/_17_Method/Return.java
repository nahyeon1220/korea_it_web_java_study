package _17_Method;

public class Return {
    public static String getName() {
        String name = "나현";
        return name;
    }

    public static int getAge() {
        int age = 23;
        return age;
    }

    public static void main(String[] args) {
        //return 반환값
        //void -> 반환값이 없음
        System.out.println(getName());
        System.out.println(getAge());

        String myName = getName();
        System.out.println(getName());

        int myAge = getAge();
        System.out.println(getAge());
    }
}
