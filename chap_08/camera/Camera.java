package chap_08.camera;

public abstract class Camera {
    public void takePic() {
        System.out.println("사진을 촬영합니다. ");
    }

    public void recordVideo(){
        System.out.println("동영상을 녹화합니다.");
    }


    public abstract void showMainFeature(); //구현 클래스

}
