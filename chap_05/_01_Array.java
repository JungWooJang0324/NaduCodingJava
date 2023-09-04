package chap_05;

public class _01_Array {
    public static void main(String[] args) {
        //배열 : 같은 자료형의 값 여러개를 저장하는 연속된 공간
        String coffeeRoss = "아메리카노";
        String coffeeRachel= "카페모카";
        String coffeeChandler = "카페 라떼";
        String coffeeMonica = "카푸치노";

        System.out.println(coffeeRoss + " 하나");
        System.out.println(coffeeRachel + " 하나");
        System.out.println(coffeeChandler + " 하나");
        System.out.println(coffeeMonica + " 하나");

        String[] coffees = new String[4];

        //두번째 방법
//        String coffees[] = new String[4]

        coffees[0] = coffeeRoss;
        coffees[1] = coffeeRachel;
        coffees[2] = coffeeChandler;
        coffees[3] = coffeeMonica;


        //세번째
//        String[] coffees2 = new String[] {coffeeRoss, coffeeChandler, coffeeMonica, coffeeMonica};
        String[] coffees2 = {coffeeRoss, coffeeChandler, coffeeMonica, coffeeMonica};






    }

}
