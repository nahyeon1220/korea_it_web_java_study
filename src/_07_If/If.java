package _07_If;

public class If {
    public static void main(String[] args) {
        //조건문 if
        //if문에서 실행문이 1개일 때는 중괄호 생략 가능

        //키가 120 이상이어야 탑승 가능
        int height = 130;

        if (height > 120){
            System.out.println("탑승 가능");
        } else {
            System.out.println("탑승 불가능");
        }

        //키가 120 이상이고, 어른이 아니면 탑승 가능
        boolean isAdult = false;

        if(height >= 120 && isAdult == false) {
            System.out.println("탑승 가능");
        }

        if(height >= 120 && isAdult != false) {
            System.out.println("탑승 가능");
        } else {
            System.out.println("탑승 불가능");
        }

        // 키가 120 이상이거나 어른이면 탑승 가능
        if (height >= 120 || isAdult == true){
            System.out.println("탑승 가능");
        }





    }
}
