package chap_13;

import java.io.File;

public class _04_Folder {
    public static void main(String[] args) {
        String folderName = "A";

        File folder = new File(folderName);
        folder.mkdir(); //단일 폴더 생성

        String fin = folder.exists()? "폴더가 존재합니다: "+folder.getAbsolutePath() : "폴더가 없습니다. ";
        System.out.println(fin);

        folderName="A/B/C";
        folder= new File(folderName);
        folder.mkdirs(); //다중 폴더 생성
        fin = folder.exists()? "폴더가 존재합니다: "+folder.getAbsolutePath() : "폴더가 없습니다. ";
        System.out.println(fin);

        // 윈도우 : C:\Users\chian\Desktop\study\Nadu\A\B\C
        //"A"+File.separator+"B"; 상황에 따라 다를 때 사용할 수 있습니다.

    }
}
