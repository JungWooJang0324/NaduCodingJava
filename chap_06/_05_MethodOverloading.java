package chap_06;

//메소드 오버로딩
//같은 메소드이름에 파라미터 다르게 받기
// 1. 리턴값의 타입이 다르거나
// 2. 리턴값의 갯수가 다르거나


public class _05_MethodOverloading {
    public static int getPower(int num){
        int result = num * num;

        return result;
    }

    public static int getPower(String strNum){
        int number = Integer.parseInt(strNum);

        return number;
    }

    public static int getPower(int number, int exponent){
        int result =1;

        for(int i=0; i< exponent; i++){
            result *= number;
        }

        return result;
    }


    public static void main(String[] args) {

        System.out.println(getPower(3));
        System.out.println(getPower("3"));
        System.out.println(getPower(3,3));

    }
}
