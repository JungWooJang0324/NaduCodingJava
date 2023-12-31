package chap_07;

import java.util.Random;

public class _11_Package {


    public static void main(String[] args) {
        //패키지 (랜덤 클래스)
        Random random = new Random();
        System.out.println("랜덤 정수 : " + random.nextInt());

        System.out.println("랜덤 정수 범위 " + random.nextInt(10)); //0이상 10 미만
        System.out.println("랜덤 실수 : " + random.nextDouble());


        //만약 5.0이상 10.0 미만의 실수를 뽑는다면
        double min = 5.0;
        double max = 10.0;
        System.out.println("랜덤 실수 : " + (min + (max - min) * random.nextDouble()));


        //로또 번호를 랜덤으로 뽑으려면 1~45
        System.out.println("로또 번호 :" + (random.nextInt(45) +1));


    }

}
