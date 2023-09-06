package chap_07.Camera;

public class ActionCam extends Camera{


    public static final String LENS = "광각 렌즈";

    public ActionCam() {
        super("액션카메라");
    }

    public final void makeVideo(){
        System.out.println(this.name + " : "+this.LENS+"로 멋진 비디오를 제작합니다. ");

    }




}
