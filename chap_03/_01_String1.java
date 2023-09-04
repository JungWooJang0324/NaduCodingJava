package chap_03;

public class _01_String1 {
    public static void main(String[] args) {

        String s = "I like Java and Python and C.";
        System.out.println(s);
        System.out.println(s.length());

        //대소문자 변환
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        //포함 관계
        System.out.println(s.contains("Java"));
        System.out.println(s.contains("c++"));

        //위치 정보
        System.out.println(s.indexOf("Java"));
        System.out.println(s.indexOf("C#")); //-1

        System.out.println(s.indexOf("and"));
        System.out.println(s.lastIndexOf("and"));
        System.out.println(s.startsWith("I like"));
        System.out.println(s.endsWith("."));


        System.out.println(s.matches("I Like"));





    }

}
