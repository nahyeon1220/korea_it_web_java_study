package _21_Class.Student;

public class Student {

    private String name;
    private int age;
    private String email;
    private String address;

    //private일 때 값을 넣는 방법
    //1. 생성자 (단축키: alt + insert)
    public Student(String name, int age, String email, String address) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.address = address;
    }

    //2. setter -> setter 라는 메소드를 통해서 메소드 속성에 접근
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //3. getter
    //getter 에서는 매개변수가 없기 때문에 this를 굳이 명시해놓지 않음 -> 생략되어 있음
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public void showInfo() {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("이메일: " + email);
        System.out.println("주소: " + address);
    }


}
