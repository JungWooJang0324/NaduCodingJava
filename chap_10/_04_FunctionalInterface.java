package chap_10;

import chap_10.converter.*;


public class _04_FunctionalInterface {
    public static void main(String[] args) {
        //함수형 인터페이스
        KRWConverter krwConverter = new KRWConverter();
//        krwConverter.convert(1);

        // 람다식
        convertUSD((USD)->System.out.println(USD + "달러 " + (USD * 1400)+"원"),2);
        Convertable convertable = (USD) -> System.out.println(USD + "달러 " + (USD * 1400)+"원");
        convertUSD(convertable, 3);

        //전달값이 하나도없다면?
        ConvertableWithNoParams c1 = () -> System.out.println("1달러 = 1400원");
        c1.convert();

        //두줄 이상의 코드가 있다면?
        c1 = ()-> {
            int USD = 5;
            int KRW = 1400;
            System.out.println(USD + "달러 " + (USD * 1400)+"원");
        };

        c1.convert();

        //전달값
        ConvertableWithTwoParams c2 = (USD1, KRW1)-> System.out.println(USD1 + "달러 " + (USD1 * KRW1)+"원");
        c2.convert(10, 1400);


        //반환값이 있는경우
        ConvertableWithReturn c3 = (d,w) -> d * w;
        System.out.println(c3.convert(20,1400)+"원 입니다. ");


    }


    public static void convertUSD(Convertable convertable, int USD){
        convertable.convert(USD);
    }
}
