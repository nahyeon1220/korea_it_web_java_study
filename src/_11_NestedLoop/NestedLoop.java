package _11_NestedLoop;

public class NestedLoop {
    public static void main(String[] args) {
        //이중 반복문

        //네모 별 찍기
        // *****
        // *****
        // *****
        // *****
        // *****

        for (int i = 0; i < 5 ; i++) { //세로줄
            for (int j = 0; j < 5 ; j++) { //가로로 별 찍기
                System.out.print("*");
            }
            System.out.println(); //줄바꿈
        }

        System.out.println();

        //별 삼각형 찍기
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < (i + 1); j++) {
                //n번줄일 때, 별이 n개 출력되어야 하기 때문에 조건이 i + 1이 되어야함.
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < 5 ; i++) {
            for (int j = 5; j > i ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
        SSSS* i = 0, i가 4번 j < 4
        SSS** i = 1, i가 3번 j < 3
        SS*** i = 2, i가 2번 j < 2
        S**** i = 3, i가 1번 j < 1
        ***** i = 4, i가 0번 j < 0
         */

        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < (4 - i); j++) {
                System.out.print("S");
            }
            for (int j = 0; j < (i + 1) ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
