package chap_12;

import chap_12.clean.CleanThread;

public class _01_Thread {
    public static void main(String[] args) {
        //쓰레드

        // 1 3 5 7 9
        // 2 4 6 8 10

        CleanThread ct = new CleanThread();

//        ct.run();//직원 청소
//동시 시작
        ct.start();
        cleanByBoss(); //사장 청소


//        cleanBySelf();
    }

    public static void cleanBySelf(){
        System.out.println("혼자 청소 시작");
        for(int i=1; i<=10; i++){
            System.out.println("(혼자) "+i + "번방 청소중");
        }
        System.out.println("혼자 청소 끝");
    }


    public static void cleanByBoss(){
        System.out.println("사장 청소 시작");
        for(int i=1; i<=10; i+=2){
            System.out.println("(사장) "+i + "번방 청소중");
        }
        System.out.println("사장 청소 끝");
    }

}
