package chap_09;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class _06_HashSet {
    public static void main(String[] args) {
        //Set: 중복 제거
        HashSet<String> set = new HashSet<>();
        set.add("삼겹살");
        set.add("쌈장");
        set.add("음료");
        set.add("소금");
        set.add("후추");
        set.add("삼겹살");
        set.add("깻잎");
        set.add("삼겹살");

        System.out.println(set.size() +" 개 데이터 있음! ");
        for(String s : set){
            System.out.print(s+", ");
        }

        System.out.println();
        System.out.println("----------- 삼겹살 포함여부 확인 ----------");
        if(set.contains("삼겹살")){
            System.out.println("삼겹살 있음!");
        }

        System.out.println("----------- 삼겹살 삭제 ----------");
        set.remove("삼겹살");

        System.out.println(set.contains("삼겹살")+":  삼겹살 삭제 됨. ");

        set.clear();
        System.out.println(set.size()+": 남은 구매상품수");
        System.out.println("isEmpty: "+set.isEmpty()+": 집으로 출발");


        //세트는 중복 허용x , 순서 보장 x
        HashSet<Integer> intSet = new HashSet<>();
        intSet.add(1);
        intSet.add(12);
        intSet.add(2);

        for(int i: intSet){
            System.out.print(i+", ");
        }

        System.out.println();
        System.out.println("========== 순서 보장이 필요할때 : Linked HashedSet===========");
        HashSet<Integer> intSet2 = new LinkedHashSet<>();
        intSet2.add(1);
        intSet2.add(12);
        intSet2.add(2);

        for(int i: intSet2){
            System.out.print(i+", ");
        }

    }
}
