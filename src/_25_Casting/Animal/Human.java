package _25_Casting.Animal;

public class Human extends Animal{

    @Override
    public void speak() {
        System.out.println("사람");
    }

    public void eat() {
        System.out.println("사람이 밥을 먹습니다.");
    }
}
