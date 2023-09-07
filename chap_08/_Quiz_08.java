package chap_08;

import chap_08.camera.SpeedCam;
import chap_08.detecter.AccidentDetector;
import chap_08.reporter.VideoReporter;

public class _Quiz_08 {

    public static void main(String[] args) {
        //Accident Detector 클래스 신규 생성
        // 신고 기능은 기존에 작성된 VideoReporter 클래스 활용

        SpeedCam speedCam = new SpeedCam();
        speedCam.setDetect(new AccidentDetector());
        speedCam.setReport(new VideoReporter());
        speedCam.detect();
        speedCam.report();
    }

}
