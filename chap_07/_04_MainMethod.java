package chap_07;

public class _04_MainMethod {

    public static void main(String[] args) {
        Blackbox b1 = new Blackbox();
        b1.setModelName("까망이");

        b1.autoReport(); //지원x
        Blackbox.canAutoReport = true;
        b1.autoReport(); //지원o


        b1.insertMemoryCard(256);

        //일반 1
        //이벤트 영상 (충돌 감지) : 2
        int fileCount = b1.getVideoFileCount(1);
        System.out.println("영상 갯수: " + fileCount);


        fileCount = b1.getVideoFileCount(2);
        System.out.println("이벤트 영상 갯수: " + fileCount);

        b1.getVideoFileCount(1);



    }

}
