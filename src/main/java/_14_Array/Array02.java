package _14_Array;

public class Array02 {
    public static void main(String[] args) {
        //배열 순회

        String[] countries = {"Hungary", "Croatia", "Slovenia", "Austria", "Czech"};
        //반복문 for문을 통해 배열 순회
//        for (int i = 0; i < 5; i++) {
//            System.out.println(countries[i]);
//        }

//        for (int i = 0; i < countries.length; i++) {
//            System.out.println(countries[i]);
//        }

        //enhanced for (for-each): 향상된 for문
        for(String country : countries) {
            //countries가 배열이니 안쪽에 담겨있는 값을, 값의 갯수만큼 반복하고, country에 담는다고 생각하면 됨
            //1번 값이 담기고 출력이 되면 그 후에는 2번 값이 담기고 그 후로 쭉쭉 값의 갯수만큼 반복
            System.out.println(country);
        }
    }
}
