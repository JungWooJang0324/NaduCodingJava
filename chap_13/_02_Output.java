package chap_13;

public class _02_Output {
    public static void main(String[] args) {
        //System.out.format();
//        System.out.printf();

        System.out.println("----정수----");
        System.out.printf("정수값 format값 :  %d%n", 3); //줄바꿈:%n
        System.out.printf("%d %d %d%n",20,8,63);
        System.out.printf("%d%n", 1234);   //1234
        System.out.printf("%6d%n", 1234); //  1234 공간을 빈칸으로 채우겠다
        System.out.printf("%06d%n", 1234); //001234 공간을 0으로 채우겠다
        System.out.printf("%+6d%n", 1234);
        System.out.printf("%,15d%n", 10000000); // 숫자 , 로 나누기

        System.out.printf("%-6d%n", 1234);//6자리 공간 확보후 왼쪽 정렬 1234출력


        System.out.println("------------실수---------------");
        System.out.printf("%f%n", Math.PI); //실수는 %f
        System.out.printf("%.2f%n", Math.PI); //소수점 2자리까지 .2
        System.out.printf("%6.2f%n", Math.PI); //  3.14 앞자리 마련
        System.out.printf("%-6.2f%n", Math.PI); //3.14__ 뒷자리 마련
        System.out.printf("%06.2f%n", Math.PI); //003.14 0으로 채운후 자리 마련

        System.out.println("------------문자열---------------");
        System.out.printf("%s%n", "자바"); //문자열은 s
        System.out.printf("%6s%n", "자바");
        System.out.printf("%-6s%n", "자바");
        System.out.printf("%6.1s%n", "자바");
        System.out.printf("%-6.1s%n", "자바");

        System.out.println("------------응용---------------");
        //성적 쓰기
        System.out.println("이름  영어  수학  평균");
        System.out.printf("%s %d  %d  %.2f%n", "강백호", 90, 80, (90+80)*0.5);


    }
}
