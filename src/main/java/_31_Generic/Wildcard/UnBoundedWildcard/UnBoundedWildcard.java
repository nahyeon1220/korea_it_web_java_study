package _31_Generic.Wildcard.UnBoundedWildcard;

public class UnBoundedWildcard {
    //? -> 타입에 제한이 없음 (==비한정적 와일드 카드)
    //하지만 읽기만 가능, 쓰기는 불가능 -> 타입이 명확하지 않기 때문

    public static void printBox(Box<?> box){
        System.out.println("Box 내용물: " + box.getItem()); //set은 불가능, get은 읽기라 즉 가져오는 것이 가능
    }

}
