package _31_Generic.Wildcard.LowerBoundedWildcard;

public class Main {
    public static void main(String[] args) {
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Maltese> malteseBox = new Box<>();

        SuperWildcard.putDog(animalBox); //Animal이 Dog보다 상위이기 때문에 가능
        SuperWildcard.putDog(dogBox);
//        SuperWildcard.putDog(malteseBox);
    }
}
