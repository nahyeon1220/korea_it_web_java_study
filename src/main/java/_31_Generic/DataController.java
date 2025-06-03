package _31_Generic;

import _27_Bean.UserEntity;
import _27_Bean.UserEntityLombok;

import java.util.Date;

public class DataController {
    public static void main(String[] args) {
//        ResponseData responseData = new ResponseData("데이터: ", "오나현", 23, 3.14);
//        System.out.println(responseData.toStringStr());
//        System.out.println(responseData.toStringInt());
//        System.out.println(responseData.toStringDouble());

        ResponseData<String> responseData1 = new ResponseData<>("이름: ","나현");
        System.out.println(responseData1);
        ResponseData<Integer> responseData2 = new ResponseData<>("나이: ", 23);
        System.out.println(responseData2);
        ResponseData<Double> responseData3 = new ResponseData<>("원주율: ", 3.14);
        System.out.println(responseData3);

        Date now = new Date();
        ResponseData<Date> nowData = new ResponseData<>("현재 날짜: ", now);
        System.out.println(nowData);

        UserEntityLombok userEntityLombok = new UserEntityLombok();
        userEntityLombok.setUserId(1);
        userEntityLombok.setUserName("나현");
        userEntityLombok.setAge(23);
        userEntityLombok.setEmail("Gmail");
        ResponseData<UserEntityLombok> user = new ResponseData<>("유저: ", userEntityLombok);
        System.out.println(user);

        //Product 패키지 생성
        //productController.java, product.java
        //상품 정보 -> 상품명(productName), 상품정보(productInfo)
        //Product(productName=Laptop, productInfo=Intel i7, 16GB RAM, 512GB SSD) String
        //Product(productName=Smartphone, productInfo=799.99) Double
        //Product(productName=Available, productInfo=true)    Boolean
    }
}
