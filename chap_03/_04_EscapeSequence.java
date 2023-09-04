package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        // 특수문자
        //
        System.out.println("자바가 ");
        System.out.println("너무 ");
        System.out.println("재밌어요.");

        System.out.println("자바가 \n너무 \n재밌어요.\n");

        //해물 파전 : 9000
        //김치전 : 8000;
        //부추전 : 8000;

        System.out.println("해물파전\t\t9000원");
        System.out.println("김치전\t\t8000원");
        System.out.println("부추전\t\t8000원");

        System.out.println("C:\\Programs\\Java");

        System.out.println("단비가 \"야옹\"이라고 했어요");
        System.out.println("단비가 \'뭘봐?\'라는 표정을 지었어요");
        System.out.println("단비가 '뭘봐?'라는 표정을 지었어요");

        char c = 'A';
        c = '\'';
        System.out.println(c);





    }
}
