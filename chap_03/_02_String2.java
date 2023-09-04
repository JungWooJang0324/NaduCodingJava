package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        //문자열 변환
        String str1 = s.replace("and", ",");
        System.out.println(str1);

        String str2 = s.substring(7); //7부터
        System.out.println(str2);
        System.out.println(s.substring(s.indexOf("Java")));
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf(".") + 1));

        //공백 제거
        s = "                    I Love Java           ";
        System.out.println(s);
        System.out.println(s.trim()); //앞뒤공간 제거

        //문자열 결합
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1 + s2);
        System.out.println(s1+ "," + s2);
        System.out.printf("%s , %s", s1, s2);
        System.out.println();
        System.out.println(s1.concat(",").concat(s2));


    }

}
