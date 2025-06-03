package _31_Generic.Wildcard.UpperBoundedWildcard;

public class ExtendsWildcard {
    //<? extends Animal>
    //Dog, Cat, Animal 등 Animal을 상속한 모든 파일을 받을 수 있음
    //상한 경계 와일드카드 (상위 클래스 제한)
    //읽기만 가능, 쓰기는 불가능
    //반환 타입은 Animal로 취급
    //Animal 또는 Animal를 상속한 타입만 받음

    public static void makeSound(Box<? extends Animal> box){
        Animal animal = box.getItem();
        animal.sound();

//        box.setItem(new Dog());
        //이유 : Box<? extends Animal>은 정확한 타입이 뭔지 몰라 쓰기 제한
    }
}
