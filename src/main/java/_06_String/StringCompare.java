package _06_String;

import java.sql.SQLOutput;

public class StringCompare {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Python";
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals("Java")); //equals 안에는 문자열이 들어가도 됨.
        System.out.println(str2.equalsIgnoreCase("Python"));
        //equalsIgnoreCase -> 대소문자를 구분하지 않고, 내용이 똑같은지를 판단

        String password1 = "1234";
        String password2 = "1234";
        //1234 라는 문자열이 저장되어 있는 메모리 공간을 Password1, Password2가 같은 공간을 참조

        System.out.println(password1 == password2); //참조 위치 비교
        System.out.println(password1.equals(password2)); //위치와 상관없이, 참조 내용 비교

        password1 = new String("1234");
        password2 = new String("1234");
        //new를 붙이게 되면 내용이 같더라도 메모리 공간을 각각 할당하여 다른 위치에 저장하여 각각 참조

        System.out.println(password1 == password2); //참조 위치가 다름
        System.out.println(password1.equals(password2)); //참조하는 위치는 다르지만, 내용이 같음

    }
}
