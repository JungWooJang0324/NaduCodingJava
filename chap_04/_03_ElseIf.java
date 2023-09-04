package chap_04;

public class _03_ElseIf {
    public static void main(String[] args) {
        //조건문 ElseIf

        //한라봉 에이드가 있으면 한잔 주문
        // 또는 망고주스 있으면 + 1
        // 또는 아이스아메 +1

        boolean hanlabongAde = false;
        boolean mangoJuice = false;


        if(hanlabongAde){
            System.out.println("한라봉 에이드 +1");
        }
        else if(mangoJuice){
            System.out.println("망고주스 에이드 +1");
        }
        else{
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("주문 완료 #1");


        System.out.println("/////////////////////////////////");
        //else if 여러번 사용가능

        hanlabongAde = false;
        mangoJuice = false;
        boolean orangeJuice = true;

        if(hanlabongAde){
            System.out.println("한라봉 에이드 +1");
        }
        else if(mangoJuice){
            System.out.println("망고주스 에이드 +1");
        }
        else if(orangeJuice){
            System.out.println("오렌지 주스 +1 ");
        }

        else{
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("주문 완료 #2");


        System.out.println("/////////////////////////////////");
        //else 사용 안해도 댐

        hanlabongAde = false;
        mangoJuice = false;
        orangeJuice = false;

        if(hanlabongAde){
            System.out.println("한라봉 에이드 +1");
        }
        else if(mangoJuice){
            System.out.println("망고주스 에이드 +1");
        }
        else if(orangeJuice){
            System.out.println("오렌지 주스 +1 ");
        }

        System.out.println("주문 완료 #3");



    }
}
