package chap_13;

import java.io.File;

public class _07_DeleteFile {
    public static void main(String[] args) {
        File file = new File("test2.txt");

        String result = file.delete() ? "삭제 되었습니다. "+file.getName() : "파일삭제 실패: "+file.getName();

        System.out.println(result);


        File folder = new File("A2");
        if(folder.exists()){
            if(folder.delete()) {
                System.out.println("폴더 삭제 완료");
            } else {
                System.out.println("폴더 삭제 실패");
            }
        } else {
            System.out.println("폴더가 존재하지 않습니다.");
        }


        System.out.println("------------- 폴더 삭제하기 -------------");
        deleteFolder(folder);

    }

    public static boolean deleteFolder(File folder){
        if(folder.isDirectory()){
            for(File files: folder.listFiles()){
                deleteFolder(files);
            }
        }
        System.out.println("삭제 대상 " +folder.getAbsolutePath());
        return folder.delete();
    }
}
