package _15_MultiArray;

public class MultiArray {
    public static void main(String[] args) {
        //다차원 배열 (2차원 배열) > 코테의 영역~~~^^

        //영화관 좌석
        //A1 ~ A5
        //B1 ~ B5
        //C1 ~ C5
        String[] seatA = {"A1","A2","A3","A4","A5"};
        String[] seatB = {"B1","B2","B3","B4","B5"};
        String[] seatC = {"C1","C2","C3","C4","C5"};

        //3 X 5
        //배열 안에 배열
        //[ [A1~A5], [B1~B5], [C1~C5] ]
        String[][] seats = new String[][]{
                {"A1","A2","A3","A4","A5"},
                {"B1","B2","B3","B4","B5"},
                {"C1","C2","C3","C4","C5"}
        };
        //B3 출력
        System.out.println(seats[1][2]);
        //C4 출력
        System.out.println(seats[2][3]);
        //첫줄에 3칸, 두번째줄에 4칸, 세번째줄에 5칸
        String[][] seats2 = {
                {"A1","A2","A3"}, //원래 A4, A5 공간은 할당 자체가 안됨, 아예 없는 공간 > 출력 자체가 안됨
                {"B1","B2","B3","B4"},
                {"C1","C2","C3","C4","C5"}
        };
        System.out.println(seats2[1][1]);
    }
}
