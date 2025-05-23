package _21_Class.Student;

public class StudentMain {
    public static void main(String[] args) {

        Student student = new Student("나현", 23, "Gmail","부산...");
        student.setAge(23); // -> setter 라는 메소드를 통해서 값 변경이 가능

//        student.name = "나현";
//        student.age = 23;
//        student.email = "Gmail";
//        student.address = "부산";

        System.out.println(student.getEmail()); //getter를 통해서 메소드를 거쳐 값을 출력해줌
        student.showInfo();

        //모르겠음 유튜브 노마드 코더 영상 ㄱㄱ
    }
}
