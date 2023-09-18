package chap_11;

public class _01_TryCatch {
    public static void main(String[] args) {
        //예외처리
        //오류 : 컴파일 오류, 런타임 오류 (에러 errorr , 예외 exceptions)
        //      int i= "문자열";컴파일 오류
//        int[] arr = new int[3];
//        arr[5] = 100; // 런타임 오류


//        S s = new S();
//        s.methodA(); //StackOverFlow

//        S s = null;
//        s.methodA(); //NullPointException

        try {
//            System.out.println(3/0); //이런문제 발생 -> / by zero

//            int[] arr = new int[3];
//            arr[5] = 100; //ArrayIndexOutOfBoundsException

            Object obj = "test";
            System.out.println((int)obj); //java.lang.String cannot be cast to java.lang.Integer

        }catch (Exception e){
            System.out.println("이런문제 발생 -> "+e.getMessage());
            e.printStackTrace();
        }


            System.out.println("프로그램 정상 종료");




    }

}


class S {
    public void methodA(){
        this.methodA(); //무한 루프 : StackOverflow
    }
}