package _22_Inheritance;

//Animal 상속
//부모 생성자 호출해서 객체 생성과 동시에 속성값을 넣을 수 있도록 생성자 만들기
//getter setter
//getAnimalName => 제 이름은 ___입니다.
//getAnimalAge => 올해 제 나이는 __살이고, 내년에는 __살입니다.
//move => 사람이 두발로 걷습니다.
//read(String bookName) => ___이 책이름을 읽습니다.

//main에서 객체 생성 후 위의 메소드 전부 사용

public class Human extends Animal{

    public Human(String animalName, int animalAge) {
        super(animalName, animalAge);
    }

    public String getAnimalName() {
        return "제 이름은 " + super.getAnimalName() + "입니다.";
    }

    public int getAnimalAge() {
        System.out.println("올해 제 나이는 " + super.getAnimalAge() + "살이고, 내년에는 " + (super.getAnimalAge() + 1) + "살입니다.");
        return super.getAnimalAge();
    }

    @Override
    public void move() {
        System.out.println("사람이 두 발로 걷습니다.");
    }

    public void read(String bookName){
        System.out.println(super.getAnimalName() + "이 " + bookName +"을 읽습니다.");
    }
}
