package _33_Json;

//Json (Javascript Object Notation)
//본래 자바스크립트 언어로부터 파생되어 자바스크립트 구문을 따르지만, 언어 독립형 데이터 포멧
//Map 형태처럼 키 값 형태

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

//Gson
//Google + Json의 약자로 Java 객체를 Json 형태로 변환하거나 혹은 반대로 변환할 때 사용
//주요 클래스
//Gson - 변환을 위해 (Java 객체 <-> Json) 주로 사용되는 클래스
//GsonBuilder - Gson 인스턴스에 대한 사용자 정의 구성을 허용 (prettyPrinting)등
//JsonObject - Json 객체를 나타냄
public class Json01 {
    public static void main(String[] args) {
        JsonObject jsonObject1 = new JsonObject(); //JsonObject의 인스턴스 (객체) 생성
        //요소(속성: key-value) 를 추가하는 메소드 -> addProperty()
        //Json의 모든 key는 전부 다 String 타입!!!
        jsonObject1.addProperty("username", "nahyeon");
        jsonObject1.addProperty("password", 1234);
        jsonObject1.addProperty("email", "Gmail");
        jsonObject1.addProperty("name", "나현");

        System.out.println(jsonObject1);

        //모든 key는 문자열
        //"key" : value

        Gson gson1 = new GsonBuilder().setPrettyPrinting().create();
        String json1 = gson1.toJson(jsonObject1);

        System.out.println(json1);

        JsonObject address = new JsonObject();
        address.addProperty("city", "부산");
        address.addProperty("district", "진구");
        address.addProperty("zipCode", 12345);

        //중첩일 때는 addProperty가 아닌 add를 사용!
        jsonObject1.add("address", address);

        Gson gson2 = new GsonBuilder().setPrettyPrinting().create();
        String json2 = gson2.toJson(jsonObject1);
        System.out.println(json2);
    }


}
