package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        String[] coffees = {"아메리카노", "카페모카", "카페라떼", "카푸치노"};
//        System.out.println(coffees[0] + " 하나");
//        System.out.println(coffees[1] + " 하나");

        for(int i=0; i<coffees.length; i++){
            System.out.println(coffees[i] + " 하나");
        }

        System.out.println(coffees.length);

        // for-each 반보ㅓㄱ문
        for(String coffee : coffees){
            System.out.println(coffee + " 하나");
        }

    }
}
