package chap_10;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_Stream {
    public static void main(String[] args) {
        //스트림 : 데이터가 흐른다
        //Stream 은 한번 생성하면 다음에 사용할 수 없음
        // 새로 만들어 주셔야합니다.

        int[] scores = {100, 95, 90, 85, 80};
        IntStream scoreStream = Arrays.stream(scores);

        String[] langs = "Python,java,javascript,c,c++,c#".split(",");
        Stream<String> stringStream = Arrays.stream(langs);

        List<String> langList = new ArrayList<>();
        langList = Arrays.asList("Python,java,javascript,c,c++,c#".split(","));

//        System.out.println(langList.size());
        Stream<String> langListStream = langList.stream();

        Stream<String> langListofStream = Stream.of("Python,Java,Javascript,c,c++,c#".split(","));

        //스트림 사용

        //중간 연산 (Intermediate Operation) : filter, map, sorted, distinct, skip
        //최종 연산 (Intermediate Operation) : count, min, max, sum, forEach, anyMatch, allMatch....

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


        //문자열 처리
        // "python", "java", "javascript"
        Arrays.stream(langs).filter(x -> x.startsWith("c")).forEach(System.out::println);
        System.out.println("==================================================");
//        c
//        c++
//        c#

        //java라는 글자를 포함하는 언어
        Arrays.stream(langs).filter(x-> x.contains("java")).forEach(System.out::println);
        System.out.println("==================================================");

        //글자 길이가 4 이하
        langList.stream().filter(x-> x.length() <=4).sorted().forEach(System.out::println);
        System.out.println("==================================================");
//        c
//        c#
//        c++
//        java

        langList.stream().filter(x-> x.length() <=4 ).filter(x -> x.contains("c")).forEach(System.out::println);
        System.out.println("==================================================");

        boolean anyMatch = langList.stream()
                .filter(x -> x.length() <= 4)
                .anyMatch(x -> x.contains("c"));

        System.out.println(anyMatch);
        System.out.println("==================================================");

        //4글자 이하의 언어중 C라는 글자를 포함하는 언어 뒤에 어려워요 라는 글자를 함께 출력
        langList.stream()
                .filter(x -> x.length() <=4)
                .filter(x->x.contains("c"))
                .map(x-> x+"(어려웡)").forEach(System.out::println);

        System.out.println("==================================================");
        //대문자로 변경
        langList.stream()
                .filter(x->x.contains("c"))
                .map(String::toUpperCase)
                .forEach(System.out::println);

        System.out.println("==================================================");
        //c 라는 글자를 포함하는 언어를 대문자로 변경하고 리스트에 저장
         List<String> lsit = langList.stream()
                .filter(x->x.contains("c"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

         lsit.stream().forEach(System.out::println);

    }
}
