package chap_07;

import chap_07.Camera.Camera;
import chap_07.Camera.FactoryCam;
import chap_07.Camera.SpeedCam;

public class _12_Inheritance {
    public static void main(String[] args) {
        //상속

        Camera cam = new Camera();
        FactoryCam fc = new FactoryCam();
        SpeedCam sc = new SpeedCam();


        System.out.println(cam.name);
        System.out.println(fc.name);
        System.out.println(sc.name);


        //extends를 사용하면 자식 클래스에서 부모클래스를 물려받고 사용할 수 있게 됩니다.
        cam.takePic(); //부모클래스 호출
        sc.takePic(); //자식클래스 호출
        fc.recordVideo();



    }
}
