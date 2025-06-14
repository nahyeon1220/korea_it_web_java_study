package StreamApi;

//StreamApi
//Java8부터 도입, 컬렉션(List, Set)과 배열에 저장된 데이터를 선언형으로 처리하기 위한
//추상화된 반복 프레임워크
//필터링, 매핑, 정렬, 집계 등등

import java.util.Arrays;
import java.util.List;

//간결성 -> 가독성 향상(메소드 체이닝: 메소드를 연속적으로 호출)
public class StreamApi {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("김영", "김일", "김이", "김삼", "김사", "최오", "최육", "이칠", "박팔");
        System.out.println(names);

        //1. Filter() -> 어떠한 조건을 통해 거르는 것
        List<String> namesWithKim = names.stream()
                .filter(name -> name.startsWith("김")) //필터 안의 람다가 "김"으로 시작되는지 확인 (Stream 타입)
                .toList(); //toList()를 해줘야 리스트 타입으로 반환

        System.out.println("namesWithKim: " + namesWithKim);

        List<String> englishNames = Arrays.asList("alice", "anya", "bacon", "camel", "pascal", "yor", "spy");
        System.out.println("englishNames: " + englishNames);

        List<String> result = englishNames.stream()
                .filter(name -> name.startsWith("a"))
                .map(String::toLowerCase)
                //내부 요소들에게 각각 메소드를 적용하는 형태
                //() -> :: 같은 작용
                //() -> 각각 요소를 매개변수로 받아서 매개변수를 참조하여 메소드를 호출
                // :: -> 해당 타입 클래스의 메소드를 직접 호출하여 각각 요소에 적용
                .sorted() //정렬
                .toList();

        System.out.println("result: " + result);
        result.forEach(name -> System.out.println(name));
        result.forEach(System.out :: println); //이렇게 줄일 수도 있음
        System.out.println();

        //만약에 이름의 길이가 4 이상인 것만 갯수를 구하면?
        int count = 0;
        for (int i = 0; i < englishNames.size(); i++) {
            if (englishNames.get(i).length() >= 4) {
                count++;
            }
        }
        System.out.println("이름의 길이가 4 이상인 것의 갯수(일반 for문): " + count);

        long count1 = englishNames.stream()
                .filter(name -> name.length() >= 4)
                .count(); //long으로 반환

        System.out.println("이름의 길이가 4 이상인 것의 갯수(Lambda): " + count1);


    }

}
