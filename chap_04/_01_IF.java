package chap_04;

public class _01_IF {
    public static void main(String[] args) {
/*        if ( 조건 ){
            ...수행할 명령...
        }*/


        //조건문 if
        int hour = 15; //오전 10시

        if (hour < 14){
            System.out.println("아이스 아메리카노+1");
            System.out.println("샷 추가");
        }
        System.out.println("커피 주문 완료 #1");

        System.out.println("////////////////////////////////////////////////////");
        // 오후 2시 이전이면서 모닝커피를 마시지 않은 경우?
        hour = 10;
        boolean morningCoffee = false;
        if ( hour < 14 && !morningCoffee) {
            System.out.println(" 모닝커피 안 마심! ");
            System.out.println("아이스 아메리카노");
            System.out.println("샷 추가");
        }
        System.out.println("커피 주문 완료 #2");

        System.out.println("////////////////////////////////////////////////////");
        //오후 2시 이후이거나 모닝 커피를 마신 경우
        hour =15;
        morningCoffee = true;
        if(hour >= 14 || morningCoffee) {

            System.out.println("디카페인 아이스 아메리카노");
        }
        System.out.println("커피 주문 완료 #3");



    }
}
