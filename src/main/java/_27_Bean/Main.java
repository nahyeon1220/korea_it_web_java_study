package _27_Bean;

public class Main {
    public static void main(String[] args) {
        //UserEntity
        //UserId, UserName, age, email -> private
        //기본 생성자 하나 만들기
        //getter / setter

        //toString 오버라이드해서 정보 모두 출력

        UserEntity userEntity = new UserEntity();
        userEntity.setUserId(1);
        userEntity.setUserName("나현");
        userEntity.setUserAge(23);
        userEntity.setUserEmail("Gmail");

        System.out.println(userEntity);

        UserEntityLombok userEntityLombok = new UserEntityLombok();
        userEntityLombok.setUserId(2);
        userEntityLombok.setUserName("나현");
        userEntityLombok.setAge(23);
        userEntityLombok.setEmail("Gmail");

        System.out.println(userEntityLombok);

    }
}

