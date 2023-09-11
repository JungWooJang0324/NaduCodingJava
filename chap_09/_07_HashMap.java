package chap_09;

import java.util.HashMap;

public class _07_HashMap {
    public static void main(String[] args) {
        //HashMap<키, value>
        HashMap<String, Integer> map = new HashMap<String,  Integer>();

        //데이터 추가
        map.put("유재석", 10);
        map.put("박명수", 5);
        map.put("김종국", 3);
       // map.put("서장훈", 15);

        System.out.println("총 고객수" +map.size());
        System.out.println("======================================");
        System.out.println("==================조회====================");

        System.out.println("유재석 님의 포인트 넘버: "+map.get("유재석"));
        System.out.println("박명수 님의 포인트 넘버: "+map.get("박명수"));

        System.out.println("==================특정 key 조회====================");
        if(map.containsKey("서장훈")){
            int point = map.get("서장훈");
            map.put("서장훈", ++point);
            System.out.println("서장훈 님의 누적 포인트: "+map.get("서장훈"));
        }else{
            map.put("서장훈", 1);
            System.out.println("서장훈님 신규 고객 추가: " + map.get("서장훈") );
        }

        System.out.println("=================================================");
        map.remove("유재석");
        System.out.println(map.get("유재석")==null?"유재석 없음":"유재석 있음");

        System.out.println("==================키 값을 가지고 와보자========================");

        for(String key: map.keySet()){
            System.out.println("고객 이름: "+key+ "  포인트 : "+map.get(key));
        }
        System.out.println("=================================================");


        //Map은 key값에서 중복을 허용하지 x, 순서를 보장해주지 않습니다.



    }
}
