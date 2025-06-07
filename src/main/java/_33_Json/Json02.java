package _33_Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@ToString
class User{
    private String username;
    private String password;
    private String email;
    private String name;
    private String age;
}

public class Json02 {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();

        String userJson = null;
        //Java 객체 -> json

        User user = new User("nahyeon",
                "9876",
                "Gmail",
                "나현",
                "23");

        System.out.println("user 객체 " + user);
        userJson = gson.toJson(user); //user 객체가 String 형태로 변환
        System.out.println("gson만 사용 " + userJson); //한줄로 만들어진 Json

        userJson = gsonBuilder.toJson(user); //user 객체를 json 형태로 예쁘게 변환
        System.out.println("gsonBuilder 사용 " + userJson);

        //JsonObject -> json
        JsonObject jsonObject1 = new JsonObject();
        jsonObject1.addProperty("studentCode", "20250001");
        jsonObject1.addProperty("studentName", "나현");
        jsonObject1.addProperty("studentYear", "2");
        jsonObject1.addProperty("score", "96.7");

        String studentJson = gson.toJson(jsonObject1);
        System.out.println("gson 사용 " + studentJson);

        studentJson = gsonBuilder.toJson(jsonObject1);
        System.out.println("gsonBuilder 사용 " + studentJson);

        //Map -> Json

        Map<String, String> map1 = new HashMap<>();
        map1.put("productCode", "DBDBSDHS");
        map1.put("productName", "삼성 갤럭시 이온");

        System.out.println("gson 사용 " + gson.toJson(map1));
        System.out.println("gsonBuilder 사용 " + gsonBuilder.toJson(map1));
        String prodeuctJson = gsonBuilder.toJson(map1);

        //Json -> Map
        Map<String, String> map2 = gson.fromJson(prodeuctJson, Map.class);
        System.out.println(map2);

        //Json -> User 객체
        User user2 = gson.fromJson(userJson, User.class);
        System.out.println(user2);

        //Json -> JsonObject => 변환할 수 있다는 것은 Json과 JsonObject는 같은 형태가 아니라는 뜻
        //studentJson의 자료형은 String -> jsonObject의 자료형 JsonObject
        JsonObject jsonObject2 = gson.fromJson(studentJson, JsonObject.class);
        System.out.println(jsonObject2);
    }
}
