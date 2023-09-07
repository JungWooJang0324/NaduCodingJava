package chap_09;

import java.util.*;

public class _04_ArrayList {
    public static void main(String[] args) {
        //컬렉션 프레임워크
        // 고정 길이 : int[] array = new int[3];
        ArrayList<String> arr = new ArrayList<>();
        arr.add("유재석");
        arr.add("조세호");
        arr.add("김종국");
        arr.add("강호동");


        System.out.println(arr.get(0));
        System.out.println("-----------반복문------------");
        for(String p : arr){
            System.out.println(p);
        }
        System.out.println("-----------인원 삭제------------");
        arr.remove("강호동");
        for(String p : arr){
            System.out.println(p);
        }
        System.out.println("-----------인원 변경------------");
        arr.set(0, "유재석변경");
        for(String p : arr){
            System.out.println(p);
        }

        System.out.println("-----------인원 위치------------");
        System.out.println("김종국 위치 : "+arr.indexOf("김종국")+1);


        // 전체 삭제
        arr.clear();
        System.out.println(arr.size() + "개 ");


    }
}
