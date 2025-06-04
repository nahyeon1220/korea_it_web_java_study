package _32_Collections.strMap;

import java.util.*;

public class StrMap {
    //Map - 키(Key) / 값(Value)의 쌍으로 이루어진 데이터들의 집합
    //키는 중복 불가능 <-> value는 중복 가능, 순서 없음

    public static void main(String[] args) {
        Map<String, String> strMap1 = new HashMap<>();

        //Map에 Key - Value 쌍으로 삽입 -> .put(키, 값)
        strMap1.put("onh20030122", "오나현");
        strMap1.put("onh20030123", "육나현");
        strMap1.put("onh20030124", "칠나현");
        strMap1.put("onh20030125", "팔나현");
        strMap1.put("onh20030126", "구나현");

        //출력
        System.out.println(strMap1);

        //Map의 순회
        //Map은 직접적으로 순회가 불가능 -> 직접 for-each를 돌릴 수 없음
        //why?
        //순회하기 위해서는 Iterable<?> 인터페이스를 구현한 클래스이거나 배열(T[])인 것들만 가능
        //collection은 iterable 인터페이스를 상속 받음. (iterable은 반복이 가능하게 하는 인터페이스)
        //근데 Map은 collection 이 아님, 그래서 순회가 불가능
        //그럼에도 순회를 해야한다면
        System.out.println(strMap1.entrySet()); //키 값 전체를 set 형태로 변환
        System.out.println(strMap1.keySet()); //키만 set 형태로 변환

        //keySet을 이용했을 때
        for (String key : strMap1.keySet()){
            System.out.println("키: " + key + " 값: " + strMap1.get(key));
        }

        System.out.println();

        //entrySet을 이용했을 때
        for (Map.Entry<String, String> entry: strMap1.entrySet()){
            System.out.println("키: " + entry.getKey() + " 값: " + entry.getValue());
        }
        //entrySet을 이용하게 되면 키값 전체 내용이 set 형태로 오는데 keySet처럼 한가지만 String으로 들어가는게 아님
        //그래서 키값 형태를 받아줄 수 있는 Map.Entry에 넣어야 함
        //Map.Entry는 Map에 들어가는 데이터의 형식인 키값 형태

        //수정 또는 추가
        strMap1.put("onh20030111", "일나현");
        //이미 있는 키라면 값의 수정 발생
        //없는 키라면 추가 발생
        System.out.println(strMap1);

        //특정 key의 value 조회
        System.out.println(strMap1.get("20030122"));
        //Map에는 인덱스(순서)가 없음 -> 키로 접근해서 값을 출력

        //특정 key의 존재 여부
        boolean isContain1 = strMap1.containsKey("20030122");
        System.out.println("onh20030122의 존재 여부: " + isContain1);

        //특정 value의 존재 여부
        boolean isContain2 = strMap1.containsValue("육나현");
        System.out.println("육나현의 존재 여부: " + isContain2);

        //Map -> Set 형태 변환
        Set<Map.Entry<String,String>> entrySet1 = new HashSet<>();
        Set<Map.Entry<String,String>> entrySet2 = strMap1.entrySet();
        System.out.println(entrySet2.size()); //키값을 하나의 element로 보고 있음
        System.out.println(entrySet2);

        //Map -> List 형태 변환 (Set을 거쳐서)
        List<Map.Entry<String,String>> entryList1 = new ArrayList<>();
        entryList1.addAll(entrySet2);
        //Map은 collection이 아니기 때문에 set을 거쳐서 넣는다.
        System.out.println(entryList1);

        //Map 정렬 -> 사실은 불가능
        //Map은 빠른 탐색 및 검색을 위해서 만들어진 (설계된) 형태
        //정렬은 고려되지 않고 만듦 -> 때문에 순서를 미보장
        //그럼에도 정렬을 하고 싶다면?
        Collections.sort(entryList1, Map.Entry.comparingByValue());//값 기준 정렬
        System.out.println("값 기준 정렬 : " + entryList1);
        Collections.sort(entryList1, Map.Entry.comparingByKey());//키 기준 정렬
        System.out.println("키 기준 정렬 : " + entryList1);
        Collections.sort(entryList1, Map.Entry.comparingByKey(Comparator.reverseOrder()));//키 기준 역순 정렬
        System.out.println("키 기준 역순 정렬 : " + entryList1);

        //Key Set 출력
        Set<String> keySet = strMap1.keySet();
        System.out.println(keySet);



    }

}
