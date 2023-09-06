package chap_07;

import chap_07.Camera.FactoryCam;
import chap_07.Camera.SpeedCam;

public class _15_Super {
    public static void main(String[] args) {
        //super
        FactoryCam fc = new FactoryCam();
        SpeedCam sc = new SpeedCam();


        fc.recordVideo();
        System.out.println("------------------------");
        sc.takePic();



    }

}
