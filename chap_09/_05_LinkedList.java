package chap_09;

import java.util.LinkedList;

public class _05_LinkedList {
    // Linked List

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");


        //데이터 조회
        System.out.println("list.get(0) == list.getFirst()가 같나? : "+list.get(0).equals(list.getFirst()));
        System.out.println("list.get(4) == list.getLast()가 같나? : "+list.get(4).equals(list.getLast()));

        //list 추가
        list.addFirst("서장훈");
        System.out.println("list.get(0) == 유재석 인가? : "+list.get(0).equals("유재석"));

        for(String s : list){
            System.out.print(s + ", ");
        }

        System.out.println();

        list.addLast("김희철");
        for(String s : list){
            System.out.print(s + ", ");
        }
        System.out.println();

        // 인원추가
        list.add(1, "김영철");
        System.out.println("-------유재석-> 김영철-----");

        for(String s : list){
            System.out.print(s + ", ");
        }
        System.out.println();
        System.out.println("-----인원 삭제-----");
        // index 로 지정해주기
        list.remove(list.size()-1);
        for(String s : list){
            System.out.print(s + ", ");
        }
        System.out.println();


        //변경
        System.out.println("-----인원 변경-----");
        list.set(0, "이수근");
        for(String s : list){
            System.out.print(s + ", ");
        }
        System.out.println();

        System.out.println("-----인원 확인-----");
        System.out.println("인원에 김종국은 몇번째 인가요 ? : "+ list.indexOf("김종국"));
        if(list.contains("김종국")){
            System.out.println("수강신청 성공");
        }
        System.out.println();

        //list 삭제
        System.out.println("-----list 전체 삭제-----");
        list.clear();
        System.out.println("list.clear() 갯수: "+list.size());






    }



}
