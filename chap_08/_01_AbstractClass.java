package chap_08;

import chap_08.camera.Camera;
import chap_08.camera.FactoryCam;
import chap_08.camera.SpeedCam;

public class _01_AbstractClass {
    public static void main(String[] args) {
        // 데이터 추상화 data abstraction
        // 추상 클래스 (아직 완성되지 않은 클래스)
        // 추상메소드(추상 클래스& 인터페이스 에서만 사용)


        //추상클래스인 Camera는 사용할 수 없지만
        // 지정해둔 factorycam은 사용할 수 있습니다
        //Camera cam = new Camera() {};
        FactoryCam fc = new FactoryCam(); //-> Camera fc=new FactoryCam(); 부모 클래스를 사용할 수 있습니다.
        fc.showMainFeature(); //화재감지

        SpeedCam sc = new SpeedCam();
        sc.showMainFeature(); //속도 측정, 번호 인식





    }

}
