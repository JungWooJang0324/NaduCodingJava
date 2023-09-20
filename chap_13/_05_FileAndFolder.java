package chap_13;

import java.io.File;

public class _05_FileAndFolder {
    public static void main(String[] args) {
        String folder = ".";
        File filesAndFolders = new File(folder);
        System.out.println("현재 폴더 경로  "+filesAndFolders.getAbsolutePath());

        for(File file : filesAndFolders.listFiles()){
            //System.out.println(file.getName());
//            .idea
//            A
//            Nadu.iml
//            out
//            src
//            test.txt

            String result = file.isFile()? "파일 : "+file.getName() : "디렉터리 : "+file.getName();
            System.out.println(result);

//            디렉터리 : .idea
//            디렉터리 : A
//            파일 : Nadu.iml
//            디렉터리 : out
//            디렉터리 : src
//            파일 : test.txt
        }

        String folder2 = ".\\src\\chap_13";
        File filesAndFolders2 = new File(folder2);
        for(File file2 : filesAndFolders2.listFiles()){
            System.out.println(file2);
        }


    }
}
