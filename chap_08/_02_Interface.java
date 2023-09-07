package chap_08;

import chap_08.camera.FactoryCam;
import chap_08.detecter.AdvancedFireDetector;
import chap_08.detecter.Detectable;
import chap_08.detecter.FireDetector;
import chap_08.reporter.NormalReporter;
import chap_08.reporter.VideoReporter;

public class _02_Interface {
    // 인터페이스
    // 추상클래스와는 다르게 껍데기만
    // 다상속(extends)

    public static void main(String[] args) {
        NormalReporter nreporter = new NormalReporter();
        nreporter.report();

        VideoReporter vReporter = new VideoReporter();
        vReporter.report();


        Detectable fd = new FireDetector();
        fd.detect();

        Detectable ad = new AdvancedFireDetector();
        ad.detect();

        System.out.println("================================================");
        FactoryCam fc = new FactoryCam();
        fc.setDetector(ad);
        fc.setReporter(vReporter);

        fc.detect();
        fc.report();


    }


}
