package chap_07;

import chap_07.Camera.ActionCam;
import chap_07.Camera.SlowActionCam;

public class _17_Final {
    public static void main(String[] args) {
        //Final
        // public (final) class ..
        // public (final) void ..
        // public > abstract >  static > final ..


        ActionCam ac = new ActionCam();

        ac.recordVideo();
        ac.makeVideo();

        System.out.println("============================================");
        // final로 변환시 값을 변경하려고 할때 에러가 난다
        //        ac.LENS = "표준렌즈";
        ac.makeVideo();

        System.out.println("============================================");

        SlowActionCam sac = new SlowActionCam();
        sac.recordVideo();
        sac.makeVideo();

    }

}
