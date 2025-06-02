package _07_If;

public class ElseIf {
    public static void main(String[] args) {
        //다중 조건문
        int avgScore = 88;

        //90 이상이면 "A"
        //80 이상이면 "B"
        //70 이상이면 "C"
        //나머지면 "D"

        if (avgScore >= 90){
            System.out.println("등급: A");
        } else if (avgScore >= 80) {
            System.out.println("등급: B");
        } else if (avgScore >= 70) {
            System.out.println("등급: C");
        } else {
            System.out.println("등급: D");
        }
        //앞에 참이 나온 조건이 있으면 뒤에는 다 무시

        //중첩 if문
        int y = 23;
        String gender = "Female";

        if (y >= 20){
            if (gender.equals("Female")){
                System.out.println("성인 여성 입니다.");
            } else {
                System.out.println("성인 남성 입니다..");
            }
        } else {
                System.out.println("성인이 아닙니다.");
            }
        }


    }
