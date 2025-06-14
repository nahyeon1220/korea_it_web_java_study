package StreamApi;

//1. 스캐너 객체 생성, product List 하나 생성
//"애플 아이폰 15 Pro",
//"애플 맥북 프로 M3",
//"애플 아이패드 에어 5세대",
//"삼성 갤럭시 S24 울트라",
//"삼성 갤럭시 Z 플립 5",
//"삼성 갤럭시탭 S9",
//"엘지 울트라기어 게이밍 모니터" 제품들 넣기
//2. 브랜드 키워드 입력받기 => stream filter이용해서 키워드 브랜드 뽑아내고 List에 담기
//3. 뽑아온 브랜드 상품들 출력 없으면 없다고 출력

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StreamApiExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> products = Arrays.asList("애플 아이폰 15 Pro", "애플 맥북 프로 M3", "애플 아이패드 에어 5세대",
                "삼성 갤럭시 S24 울트라", "삼성 갤럭시 Z 플립 5", "삼성 갤럭시탭 S9", "엘지 울트라기어 게이밍 모니터");

        System.out.print("브랜드 입력: ");
        String input = scanner.nextLine();

        if(input.equalsIgnoreCase("apple")) {
            input = "애플";
        } else if (input.equalsIgnoreCase("samsung")) {
            input = "삼성";
        } else if(input.equalsIgnoreCase("lg")) {
            input = "엘지";
        }

        String keyword = input;

        List<String> result = products.stream()
                .filter(product -> product.contains(keyword))
                .toList();

        System.out.println(keyword + " 브랜드 상품 목록");

        if(result.isEmpty()){
            System.out.println("해당 브랜드의 상품이 없습니다.");
        } else {
            result.forEach(System.out::println);
        }



    }
}
