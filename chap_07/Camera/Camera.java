package chap_07.Camera;

public class Camera {
    public String name;

    public Camera() {
        this.name = "카메라";
    }


    public void takePic() {
        //사진 촬영
        System.out.println(this.name + ": 사진 촬영");
    }

    public void recordVideo() {
        //동영상 촬영
        System.out.println(this.name + ": 동영상 촬영");
    }


    public void mainFeature(){
        System.out.println(this.name + "의 주요 기능 : 사진 쵤영, 동영상 녹화");
    }


}
