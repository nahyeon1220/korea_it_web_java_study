package _35_Lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//1. 스캐너 객체 선언 후 입력 받아서 저장할 Map 선언 (String, Integer)
//2. 상품을 입력할 갯수를 count로 입력 받기 (nextInt)
//3. count만틈 반복해서 상품명(키)과 가격(값)으로 입력 받고 map에 추가
public class LambdaMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> map1 = new HashMap<>();

        System.out.print("입력할 상품의 갯수: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < count; i++) {
            System.out.print("상품명 입력: ");
            String productName = scanner.nextLine();

            System.out.print("가격 입력: ");
            int productPrice = scanner.nextInt();
            scanner.nextLine();

            map1.put(productName, productPrice);
        }

        System.out.println("[상품 목록]");
        map1.forEach((name, price) ->
                System.out.println("상품명: " + name + ", 가격: " + price));
    }
}
