package chap_07;

public class _01_Class {

    public static void main(String[] args) {
        //객체 지향 프로그래밍 (OOP : Object Oriented Programming)
        // 유지보수 용이
        // 높은 재사용성

        String[] items = {"CPU", "RAM", "하드디스크"};

        //차량용 블랙박스
        //모델명, 해상도, 가격, 색상

        //우리가 만든 첫번째 제품
        String modelName = "까망이";
        String resolution = "FHD";
        int price = 200000;
        String color = "Black";

        //새로운 제품을 개발
        String modelName2 = "하양이";
        String resolution2 = "UHD";
        int price2 = 300000;
        String color2 = "화이트";



        //객체
        Blackbox bb = new Blackbox();
        bb.setModelName("오렌지");
        System.out.println(bb.getModelName());

    }

}
