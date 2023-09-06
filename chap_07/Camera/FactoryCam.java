package chap_07.Camera;

public class FactoryCam extends Camera{
    public String name;

    public FactoryCam() {
        //this.name = "공장 카메라"
        super("공장 카메라");

    }

  /*  public void takePic() {
        //사진 촬영
        System.out.println("공장 : 사진 촬영");
    }


*/


    public void recordVideo() {
        //동영상 촬영
        super.recordVideo();
        detect();
    }


    public void detect() {
        //화제감지
        System.out.println("공장 : 화제감지 카메라");
    }
    @Override
    public void mainFeature() {
        System.out.println(this.name + "의 주요 기능 : 사진 쵤영, 동영상 녹화, 화재감지");
    }
    



}
