package chap_09;

import chap_09.Coffee.CoffeeByName;
import chap_09.Coffee.CoffeeByNickname;
import chap_09.Coffee.CoffeeByNumber;
import chap_09.Coffee.CoffeeByUser;
import chap_09.user.User;
import chap_09.user.VIPUser;

public class _02_GenericClass {

    public static void main(String[] args) {
        //제네릭 클래스
        CoffeeByNumber cbn = new CoffeeByNumber(33);
        cbn.ready();

        CoffeeByNickname cnickname = new CoffeeByNickname("jjw");
        cnickname.ready();

        System.out.println("----------------------------------------------------");
        CoffeeByName c1 = new CoffeeByName(34);
        c1.ready();
        CoffeeByName c2 = new CoffeeByName("박명수");
        c2.ready();
        CoffeeByName c3 = new CoffeeByName(10.0);
        c3.ready();

        System.out.println("----------------------------------------------------");
        int c1Name = (int)c1.name;
        System.out.println("주문 고객번호 : "+ c1Name);

        String c2Name= (String) c2.name;
        System.out.println("주문 고객번호 : "+ c2Name);


        System.out.println("----------------------------------------------------");
        CoffeeByUser<User> c7 = new CoffeeByUser<>(new User("강호동"));
        c7.ready();
        CoffeeByUser<User> c7VIP = new CoffeeByUser<>(new VIPUser("유재석"));
        c7VIP.ready();

        System.out.println("----------------------------------------------------");
        
        orderCoffee("김영철");
        orderCoffee(40);
        orderCoffee("김희철", "americano");
        
    }

    public static <T> void orderCoffee(T name){
        System.out.println("커피 준비 완료: "+ name);
    }

    public static <T, V> void orderCoffee(T name, V coffee){
        System.out.println("커피 준비 완료: "+ name +"님, 주문하신 "+coffee+" 나왔습니다. ");
    }
}
