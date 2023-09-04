package chap_02;

//산술 연산자
public class _01_Operator1 {
    public static void main(String[] args) {
        System.out.println(4+2);
        System.out.println(4 - 2);
        System.out.println(4 * 2);
        System.out.println(4 / 2);
        System.out.println(5 / 2);
        System.out.println(2 / 4);
        System.out.println(4 % 2);

        //우선순위
        System.out.println(2 + 2 * 2);

        int a = 20;
        int b = 10;
        int c;

        c = a+b;
        System.out.println(c);


        c= a*b;
        System.out.println(c);

        c = a/b;
        System.out.println(c);

        c = a % b;
        System.out.println(c);


        // 증감 연산자
        int val = 10;
        System.out.println(val);
        System.out.println(++val);  // val에 + 해줘라 -> print 해줘라
        System.out.println(val);

        System.out.println(val++); // print먼저 -> val에 + 해줘라
        System.out.println(val);

        //은행 대기번호 표
        int waiting = 0;
        System.out.println("대기인원 : " + waiting++);
        System.out.println("대기인원 : " + waiting++);
        System.out.println("대기인원 : " + waiting++);
        System.out.println("총 대기인원 : " + waiting++);





    }

}
