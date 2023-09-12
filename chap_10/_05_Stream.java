package chap_10;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_Stream {
    public static void main(String[] args) {
        //스트림 : 데이터가 흐른다
        int[] scores = {100, 95, 90, 85, 80};
        IntStream scoreStream = Arrays.stream(scores);

        String[] langs = "Python,Java,Javascript,c,c++,c#".split(",");
        Stream<String> stringStream = Arrays.stream(langs);

        List<String> langList = new ArrayList<>();
        langList = Arrays.asList("Python,Java,Javascript,c,c++,c#".split(","));

//        System.out.println(langList.size());
        Stream<String> langListStream = langList.stream();

        Stream<String> langListofStream = Stream.of("Python,Java,Javascript,c,c++,c#".split(","));

        //스트림 사용

        //중간 연산 (Intermediate Operation) : filter, map, sorted, distinct, skip

        // 90점 이상인 점수만 출력
        Arrays.stream(scores).filter(x -> x>= 90).forEach(x-> System.out.println(x));
        //Arrays.stream(scores).filter(x -> x>= 90).forEach(System.out::println);
        System.out.println("==================================");

        //90점 이상인 사람의 수
        int count = (int) Arrays.stream(scores).filter(x -> x>= 90).count();
        System.out.println(count + "명");
        System.out.println("==================================");
        //90점 이상인 점수들의 합
        int sum = (int) Arrays.stream(scores).filter(x -> x>= 90).sum();
        System.out.println(sum + "점");
        System.out.println("==================================");

        //90 점 이상인 점수들을 정렬
        Arrays.stream(scores).filter(x -> x>= 90).sorted().forEach(System.out::println);
        System.out.println("==================================================");
//        90
//        95
//        100

        //최종 연산 (Intermediate Operation) : count, min, max, sum, forEach, anyMatch, allMatch....





    }
}
