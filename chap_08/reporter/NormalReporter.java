package chap_08.reporter;

public class NormalReporter implements Reportable{
    String reports = "";

    @Override
    public void report() {
        System.out.println("일반 화재 신고를 진행합니다. ");
    }
}
