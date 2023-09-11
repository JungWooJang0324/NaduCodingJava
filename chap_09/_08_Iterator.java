package chap_09;

import java.util.*;
public class _08_Iterator {
    public static void main(String[] args) {
        //Iterator: 커서를 사용합니다
        List<String> list = new ArrayList<>();

        list.add("유재석");
        list.add("(알 수 없음)");
        list.add("김종국");
        list.add("강호동");
        list.add("박명수");
        list.add("(알 수 없음)");
        list.add("조세호");

        for(String str:list){
            System.out.println(str);
        }

        System.out.println("-----------------알 수 없음 삭제해보기-----------------------");
        Iterator<String> it = list.iterator();

        while(it.hasNext()){
            String s= it.next();
            if(s.contains("(알 수 없음)")) {
                it.remove(); // 삭제
            }
        }

        for(String str:list){
            System.out.println(str);
        }

        System.out.println("-----------------hashset-----------------------");

        HashSet<String> set = new HashSet<>();
        set.add("유재석");
        set.add("강호동");
        set.add("박명수");

        Iterator<String> it2 = set.iterator();

        while(it2.hasNext()){
            System.out.print(it2.next()+", ");
        }
        System.out.println("");
        System.out.println("========================================");
    }

}
