package chap_07;

import chap_07.Camera.Camera;
import chap_07.Camera.FactoryCam;
import chap_07.Camera.SpeedCam;

public class _14_Polymolphism {
    public static void main(String[] args) {
        //다형성

        //같은 부모를 바탕으로 자식 클래스를 사용할 수 잇습니다
        //FactoryCam 또는 SpeedCam is a Camera
        //is a 관계
        Camera cam = new Camera();
        Camera fcam = new FactoryCam();
        Camera speedCam= new SpeedCam();

        cam.mainFeature();
        fcam.mainFeature();
        speedCam.mainFeature();


        //하지만 부모클래스로 자식클래스를 사용시 자식클래스의 특징을 사용할 수 없다.
        //speedCam.recognizeLicensePlate(); => 이건 에러

        //사용을 위해서는 형변환을 시켜줘야합니다.
        ((SpeedCam)speedCam).recognizeLicensePlate();



    }
}
