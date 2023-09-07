package chap_08.camera;

import chap_08.detecter.Detectable;
import chap_08.reporter.Reportable;

public class SpeedCam extends Camera {
    private Detectable detect;
    private Reportable report;

    public Detectable getDetect() {
        return detect;
    }

    public void setDetect(Detectable detect) {
        this.detect = detect;
    }

    public Reportable getReport() {
        return report;
    }

    public void setReport(Reportable report) {
        this.report = report;
    }

    @Override
    public void showMainFeature() {
        System.out.println("속도 측정, 번호 인식");
    }
    public void detect(){
        detect.detect();
    }

    public void report(){
        report.report();
    }




}
