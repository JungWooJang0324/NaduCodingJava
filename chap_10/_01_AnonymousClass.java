package chap_10;

public class _01_AnonymousClass {

    public static void main(String[] args) {
        //익명 클래스
        Coffee c1 = new Coffee();
        c1.order("아메리카노");
        System.out.println("================================");

        Coffee c2 = new Coffee();
        c2.order("라뗴");
        System.out.println("================================");

        //친한칭그 방분
        Coffee spCoffee = new Coffee(){
            @Override
            public void order(String coffee) {
                super.order(coffee);
                System.out.println("딸기 케이크는 서비스 입니다. ");
            }

            @Override
            public void returnTray() {
                super.returnTray();
                System.out.println("자리에 두시면 치울게요");
            }
        };

        spCoffee.order("바닐라라떼");
        spCoffee.returnTray();


    }
}

class Coffee{
    public void order(String coffee){
        System.out.println(coffee+" 나왔습니다. ");
    }

    public void returnTray() {
        System.out.println("커피반납이 완료되었습니다. ");
    }

}