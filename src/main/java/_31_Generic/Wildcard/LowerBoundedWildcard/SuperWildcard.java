package _31_Generic.Wildcard.LowerBoundedWildcard;

public class SuperWildcard {
    //하한 경계 와일드카드: Dog 또는 Dog의 상위 타입만 허용
    public static void putDog(Box<? super Dog> box){
        box.setItem(new Dog()); //쓰기는 가능
//        Dog dog = box.getItem(); //읽기는 불가능

        //만약 읽기가 반드시 필요한 경우에는 Object를 사용
        //하지만, 읽기는 가능하나 object로 반환(업캐스팅)됨
        Object obj = box.getItem();
        System.out.println("obg: " + obj);
    }

}
