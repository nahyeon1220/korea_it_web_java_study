package _05_Operator;

public class Operator {
    public static void main(String[] args) {
        //연산자

        //대입 연산자
        int num1 = 10;
        int num2 = 5;
        /*여기서 =은 해당 변수에 데이터(값)을 대입한다는 의미로
        수학적인 같다 라는 의미와 다름*/

        //산술 연산자
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2); //몫
        System.out.println(num1 % num2); //나머지

        //복합대입 연산자
        num1 += 5; //num1 = num1 + 5
        System.out.println(num1);

        num1 -= 5; //num1 = num1 - 5
        System.out.println(num1);

        num1 *= 2; //num1 = num1 * 2
        System.out.println(num1);

        num1 /= 2; //num1 = num1 / 2 -> 몫을 가져오는 기호
        System.out.println(num1);

        num1 %= 2; //num1 = num % 2 -> 나머지를 가져오는 기호
        System.out.println(num1);

        //증감 연산자
        int j = 10;

        System.out.println(j);
        //실행이 된 후 증가
        System.out.println(j++); //해당 줄이 실행된 이후에 1의 값이 더해짐. 때문에 다음 줄부터 더해진 상태의 값이 출력

        //실행이 된 후 감소
        System.out.println(j--);

        //실행이 되기 전 증가
        System.out.println(++j); //해당 줄이 실행되기 이전에 이미 1의 값이 더해짐. 때문에 바로 1이 더해진 상태의 값이 출력

        //실행이 되기 전 감소
        System.out.println(--j);


        //비교 연산자 -> 결과가 항상 boolean 참 or 거짓 둘 중에 하나의 값으로 출력
        num1 = 5;
        num2 = 3;
        System.out.println(num1 > num2);
        System.out.println(num1 >= num2);
        System.out.println(num1 < num2);
        System.out.println(num1 <= num2);
        System.out.println(num1 == num2);
        System.out.println(num1 != num2);

        //논리 연산자 -> &, |, !
        boolean flag1 = true;
        boolean flag2 = false;

        System.out.println(flag1 & flag2);
        //& and 논리곱 -> 하나라도 false가 있으면 false (모두 true 여야 값이 true)

        System.out.println(flag1 | flag2);
        //| or 논리합 -> 하나라도 true가 있으면 true
        System.out.println(flag2 | flag2);
        //true를 가진 값이 하나라도 없기 때문에 false

        System.out.println(!flag1);

        //논리 연산자 조합 (&&, ||)
        //&& -> 선조건이 true일 때만 후조건을 실행, 선조건이 혹시라도 false 라면 후조건을 실행하지 않음
        //|| -> 선조건이 true이면 후조건을 실행하지 않음, 선조건이 false일 때만 후조건 실행
        System.out.println(flag1 && flag2);
        System.out.println(flag1 || flag2);

        //삼항 연산자
        int x = 5;
        int y = 3;
        int max = (x > y) ? x : y;
        System.out.println(max);

        int min = (x < y) ? x : y;
        System.out.println(min);

        x = 3;
        boolean isSame = (x == y) ? true : false;
        System.out.println(isSame);

        String sameStr = (x != y) ? "다름" : "같음";
        System.out.println(sameStr);

        /*
        * int height = 숫자;
        * 키가 120 이상인 경우 탑승 가능하도록 삼항연산자
        * 가능하면 "탑승 가능", 불가능하면 "탑승 불가능" 출력
        */

        int height = 161;
        String isRide = (height >= 120) ? "탑승 가능" : "탑승 불가능";
        System.out.println(isRide);
    }
}
