package chap_07.Camera;

public class SpeedCam extends Camera {
    public String name;

    public SpeedCam() {
       // this.name = "과속탐지 카메라";
        super("과속단속카메라");
        
    }
    //
//    public void recordVideo() {
//        //동영상 촬영
//        System.out.println("과속 : 동영상 촬영");
//    }
    public void takePic() {
       //사진 촬영
        super.takePic();
        checkSpeed();
        recognizeLicensePlate();
    }



    public void checkSpeed() {
        //속도 체크
        System.out.println("과속 : 속도 측정");
    }

    public void recognizeLicensePlate() {
        //번호 인식
        System.out.println("과속 : 차량번호를 인식합니다. ");
    }

    @Override
    public void mainFeature() {
        System.out.println(this.name + "의 주요 기능 : 사진 쵤영, 동영상 녹화, 속도 측정");
    }
}
