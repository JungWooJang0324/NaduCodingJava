package chap_13;

import java.io.File;
import java.io.IOException;

public class _03_File {
    public static void main(String[] args) {
        //파일 다루기
        String filename = "test.txt";
        File file = new File(filename);
        try {
            file.createNewFile();
            if(file.exists()){
                System.out.println("파일이름 : "+file.getName()); //파일이름 : test.txt
                System.out.println("파일의 경로 :"+file.getAbsolutePath() ); //파일의 경로 :C:\Users\chian\Desktop\study\Nadu\test.txt
                System.out.println("파일의 크기 : "+file.length()); //파일의 크기 : 0

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }




    }
}
