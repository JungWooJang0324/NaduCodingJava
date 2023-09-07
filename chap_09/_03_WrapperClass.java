package chap_09;

public class _03_WrapperClass {
    //래퍼클래스
    // int double float char

    public static void main(String[] args) {
        Integer i = 123;
        Double d = 1.0;
        Character c = 'A';

        System.out.println(i);
        System.out.println(d);
        System.out.println(c);

        System.out.println(i.intValue());
        System.out.println(d.intValue()); //더블형을 정수형으로 변경


    }

}
