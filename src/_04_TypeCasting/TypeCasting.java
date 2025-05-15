package _04_TypeCasting;

public class TypeCasting {
    public static void main(String[] args) {
        //형변환 TypeCasting
        //정수 -> 실수
        int scoreInt = 98;
        System.out.println(scoreInt);
        System.out.println((float) scoreInt);
        System.out.println((double) scoreInt);
        System.out.println(scoreInt);

        //실수 -> 정수
        float scoreFloat = 97.5F;
        System.out.println(scoreFloat);
        System.out.println((int) scoreFloat);

        double scoreDouble = 88.5;
        System.out.println((int) scoreDouble);

        double sum1 = 98 + 77.3;
        //적혀있지는 않지만 98 이라는 정수 앞에 (double)이 명시되어 있고 생략되어 있음. 때문에 계산이 됨.
        System.out.println(sum1);

        int sum2 = 98 + (int) 55.3F;
        System.out.println(sum2);

        int convertedScore = (int) scoreDouble;
        System.out.println(convertedScore);

        //int -> long -> float -> double: 자동 형변환
        //double 에서 int 의 단계로 거꾸로 갈 때는 형변환을 무조건 해줘야함.
        //double -> float -> long -> int: 수동 형변환 (자료형을 앞에 명시해줘야함. 즉, 명시적 형변환)
        double covertedScoreDouble = scoreInt;

        long scoreLong = 45L;
        int convertedScoreInt = (int) scoreLong;
        System.out.println(convertedScoreInt);

        //숫자 -> 문자열
        String strNum1 = String.valueOf(55); //첫번째 방법
        strNum1 = Integer.toString(55); //두번째 방법
        System.out.println(strNum1);

        //double -> 문자열
        String strNum2 = String.valueOf(88.37);
        strNum2 = Double.toString(88.37);
        System.out.println(strNum2);

        //float -> 문자열
        String strNum3 = String.valueOf(123.45F);
        strNum3 = Float.toString(123.45F);
        System.out.println(strNum3);

        //문자열 -> 숫자 (정수)
        int i = Integer.parseInt("123");
        System.out.println(i);

        //문자열 -> 숫자 (실수)
        double d = Double.parseDouble("123.45");

//        i = Integer.parseInt("숫자");
//        System.out.println(i);
    }
}
