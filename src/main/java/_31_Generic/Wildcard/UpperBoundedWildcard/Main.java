package _31_Generic.Wildcard.UpperBoundedWildcard;

public class Main {
    public static void main(String[] args) {
        Box<Dog> dogBox = new Box<>();
        dogBox.setItem(new Dog());

        Box<Cat> catBox = new Box<>();
        catBox.setItem(new Cat());

        Box<Animal> animalBox = new Box<>();
        animalBox.setItem(new Animal());

//        Box<Date> dateBox = new Box<>(); -> Animal을 상속 받지 않았기 때문에 불가능
//        dateBox.setItem(new Date());

        ExtendsWildcard.makeSound(dogBox);
        ExtendsWildcard.makeSound(catBox);
        ExtendsWildcard.makeSound(animalBox);
//        ExtendsWildcard.makeSound(dateBox); -> Animal을 상속 받지 않았기 때문에 불가능
    }
}
