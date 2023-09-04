package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        //논리
        boolean 김치찌개 = false;
        boolean 계란말이 = true;
        boolean 제육볶음 = true;

        //or
        System.out.println(김치찌개 || 계란말이 || 제육볶음);

        //and
        System.out.println(김치찌개 && 계란말이 && 제육볶음);


        System.out.println((5 > 3) && (3 > 1));       //true
        System.out.println((5 > 3) && (3 < 1));       //false

        //OR
        System.out.println((5 > 3) || (3 > 1));       //true
        System.out.println((5 > 3) || (3 < 1));       //true
        System.out.println((5 < 3) || (3 < 1));       //false
//        System.out.println((5 < 3 < 1));       //불가능 코드

        //논리 부정연산자
        System.out.println(!true); //false
        System.out.println(!false); //true




    }
}
