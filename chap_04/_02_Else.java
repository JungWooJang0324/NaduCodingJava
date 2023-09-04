package chap_04;

public class _02_Else {
    public static void main(String[] args) {
        //조건문 If Else
        int hour = 10;

        //오후 2시 이전
        if(hour < 14){
            System.out.println("아이스 아메리카노 + 1");
        }

        // 오후 2시 이후면 디카페인
        else {
            System.out.println("아이스 아메리카노 (디카페인) +1 ");
        }
        System.out.println("커피주문 완료 #1");

        System.out.println("////////////////////////");
        //오후 2시이거나 모닝커피를 마신경우
        hour = 15;
        boolean morningCoffee=true;

        if(hour >= 14 || morningCoffee ) {
            System.out.println("아이스 아메리카노(디카페인) + 1");
        }else {
            System.out.println("아이스 아메리카노 + 1");
        }

        System.out.println("커피주문 완료 #2");

    }

}
