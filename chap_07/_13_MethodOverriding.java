package chap_07;

import chap_07.Camera.Camera;
import chap_07.Camera.FactoryCam;
import chap_07.Camera.SpeedCam;

public class _13_MethodOverriding {
    //메소드 오버라이ㅣ딩 :
    // 자식클래스에서 부모클래스의 메소드를 덮어쓰기
    public static void main(String[] args) {
        Camera camera = new Camera();
        SpeedCam sc = new SpeedCam();
        FactoryCam fc = new FactoryCam();


        camera.mainFeature();
        fc.mainFeature();
        sc.mainFeature();

    }

}
