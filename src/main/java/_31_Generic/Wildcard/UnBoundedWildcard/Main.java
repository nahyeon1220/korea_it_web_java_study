package _31_Generic.Wildcard.UnBoundedWildcard;

public class Main {
    public static void main(String[] args) {
    Box<String> stringBox = new Box<>();
    stringBox.setItem("Hello");

    Box<Integer> integerBox = new Box<>();
    integerBox.setItem(1234);

    UnBoundedWildcard.printBox(stringBox);
    UnBoundedWildcard.printBox(integerBox);
    }
}
