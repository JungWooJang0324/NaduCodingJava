package chap_02;

public class _05_Operator5 {
    public static void main(String[] args) {
        //삼항연산자
        //결과 = 조건 ? 참 의 경우 결과값 : 거짓 경우 결과값

        int x = 3;
        int y = 5;

        String max = (x>y) ? "x가 더 큼" : "Y가 더 큼";

        System.out.println(max);

        boolean b = (x == y) ? true : false;
        System.out.println(b);


    }

}
