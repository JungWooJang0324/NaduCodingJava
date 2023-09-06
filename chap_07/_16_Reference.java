package chap_07;

import chap_07.Camera.Camera;

public class _16_Reference {
    public static void main(String[] args) {
        //참조
        int[] i = new int[3];
        System.out.println(i[0]);

        double[] d = new double[3];
        System.out.println(d[0]);


        //참조 자료형(Non-primitive, Reference Data Tyope) : String, Cmaer, FactoryCam...
        // 아무런 정보를 넣어주지 않았을 때, null로 출력이 된다
        String[] s = new String[3];
        System.out.println(s[0]);

        Camera[] c = new Camera[3];
        System.out.println(c[0] == null);

        System.out.println("----------------------------------------------");
        Camera c1 = new Camera();
        Camera c2 = new Camera();

        c1.name = "카메라1";
        c2.name = "카메라2";


        System.out.println(c1.name);
        System.out.println(c2.name);
        System.out.println("----------------------------------------------");

        c2= c1;
        System.out.println(c1.name);
        System.out.println(c2.name);
        System.out.println("----------------------------------------------");
        // c2와 함께 c1이 함께 변경됩니다.

        c2.name = "고장난 카메라";
        System.out.println(c1.name);
        System.out.println(c2.name);

        System.out.println("----------------------------------------------");
        changeName(c2);
        System.out.println(c1.name);
        System.out.println(c2.name);

    }


    public static void changeName(Camera cams){
        cams.name = "잘못된 카메라";
    }


}
