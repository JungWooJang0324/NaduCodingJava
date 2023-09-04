package chap_04;

public class _08_NestedLoop {
    public static void main(String[] args) {

        // 이중반복문
        // 별 (*) 사각형 만들기
/*
         ******
         ******
         ******
         ******
         ******
         ******
 */
        for(int i=0; i<6; i++){
            for(int j=0; j<6; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("===================별 왼쪽 만들기======================");

        for(int i=1; i<6; i++){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("===================별 오른쪽 만들기======================");
        for(int i=0; i<6; i++){
            for(int j=0; j<5-i; j++){
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
