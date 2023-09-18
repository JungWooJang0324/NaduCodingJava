package chap_11;

import java.sql.SQLOutput;

public class _02_Catch {
    public static void main(String[] args) {

        try {
            //System.out.println(3/0); //이런문제 발생 -> / by zero

//            int[] arr = new int[3];
//            arr[5] = 100; //ArrayIndexOutOfBoundsException
//
//            Object obj = "test";
//            System.out.println((int)obj); //java.lang.String cannot be cast to java.lang.Integer

            String s = null;
            System.out.println(s.toLowerCase());

        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.err.println("뭔가 실수를 하셨어용");
//            System.err.println("0으로는 못나눠요! ");
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.err.println("index를 잘못 설정했어요");
        }catch (ClassCastException e){
            System.err.println("잘못된 형 변환입니다.");
        } catch (Exception e){
            System.out.println("그 외의 에러가 여기서 표시 됩니다. ");
            e.printStackTrace();
        }


        System.out.println("프로그램 정상 종료");

    }
}
