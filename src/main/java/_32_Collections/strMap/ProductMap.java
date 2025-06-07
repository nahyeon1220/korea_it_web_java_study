package _32_Collections.strMap;

//문제
//1. 스캐너 객체 하나 생성, 변수명이 ProductMap인 hashMap 생성 (키: String, 값: Integer)
//2. 상품 등록하기 라고 출력하고 for문 이용, 5번 반복, 상품명(키) 입력 받고 가격(값) 입력 받고 추가
//   ***상품명 입력 받고 공백 제거***
//3. 전체 상품을 출력 -> for each 사용
//4. 상품 가격 수정 -> 수정할 상품명 입력 받고 (공백 제거) -> 입력한 상품이 존재하면 가격을 입력 받고 없으면 존재하지 않는다고 출력
//5. 특정 상품 검색 -> 검색할 상품명 입력 박고 (공백 제거) -> 입력한 상품이 productMap에 있는지 확인
//5-1. 있다면 해당 상품명과 가격 출력
//5-2. 없으면 없다고 출력
//6. 정렬 -> 정렬을 위한 리스트를 만들고 키 기준 정렬하기 -> 정렬하고 for each 출력
//7. 정렬 역순 -> 역순으로 정렬하고 for each 출력

import java.util.*;

public class ProductMap {
    public static void main(String[] args) {

        //1. 스캐너 객체 생성
        Scanner scanner = new Scanner(System.in);

        //2. 상품 등록하기, fori문 이용
        Map<String, Integer> productMap = new HashMap<>();
        System.out.println("상품 등록하기");

        for (int i = 1; i <= 5; i++) {
            System.out.print( i + "번째 상품명 입력: ");
            String productName = scanner.nextLine().trim();

            System.out.print(i + "번째 상품 가격 입력: ");
            int productPrice = Integer.parseInt(scanner.nextLine());

            productMap.put(productName, productPrice);
        }

        //3. 전체 상품 출력 -> for each 이용
        //Map일 때, for each를 사용하기 위해서는 set으로 변환해야함. keySet or entrySet
        for (Map.Entry<String, Integer> entry : productMap.entrySet()){
            System.out.println(entry);
        }

        //4. 수정

//        System.out.print("수정할 상품명: ");
//        String updateName = scanner.nextLine().trim();

//        boolean isContain1 = productMap.containsKey(updateName);
//
//        if (isContain1 == true) {
//            System.out.println("수정할 상품명의 가격: ");
//            int newPrice = Integer.parseInt(scanner.nextLine());
//            System.out.println(updateName + "의 가격이 " + newPrice + "로 수정되었습니다.");
//        } else {
//            System.out.println("존재하지 않는 상품입니다.");
//        }
        //더 간단하게
        System.out.print("수정할 상품명을 입력하세요 : ");
        String updateName = scanner.nextLine().trim();
        if(productMap.containsKey(updateName)) {
            System.out.print("수정할 가격 : ");
            int newPrice = Integer.parseInt(scanner.nextLine());
            productMap.put(updateName, newPrice);
            System.out.println("수정완료 : " + updateName + "->" + newPrice + "원");
        } else {
            System.out.println("해당 상품이 존재하지 않습니다.");
        }

        //6. 정렬
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(productMap.entrySet()); //정렬을 위한 리스트 생성
        entryList.sort(Map.Entry.comparingByKey()); //키 기준 정렬
        System.out.println("상품명 기준 정렬");
        for (Map.Entry<String, Integer> entry : entryList){
            System.out.println("- " + entry.getKey() + ": " + entry.getValue() + "원");
        }

        //7. 역순 정렬
        entryList.sort(Map.Entry.comparingByKey(Comparator.reverseOrder()));
        System.out.println("상품명 기준 역순 정렬");
        for (Map.Entry<String, Integer> entry : entryList) {
            System.out.println("- " + entry.getKey() + ": " + entry.getValue() + "원");
        }








        }
    }
