package chap_09;

public class _01_Generics {
    public static void main(String[] args) {
        //제네릭스
        // 다양한 타입의 객체를 지원하는 클래스나 인터페이스 등
        //int[] iarray = {1,2,3,4,5};
//        double[] darray= {1.0, 2.0, 3.0, 4.0};
        Integer[] iarray = {1,2,3,4,5};
        Double[] darray= {1.0, 2.0, 3.0, 4.0};
        String[] sarray = "abcde".split("");

   /*     printIntArray(iarray);
        printDoubleArray(darray);*/
        printStringArray(sarray);


        System.out.println("---------------------------------------");
        printAnyArray(iarray);
        printAnyArray(darray);
        //Generic에서 사용을 추구하는 것은 객체type임으로 string은 에러 x
        printAnyArray(sarray);



    }

    private static <T> void printAnyArray(T[] generics){
        for(T type: generics){
            System.out.print(type+ ", ");
        }
        System.out.println();
    }


    private static void printStringArray(String[] sarray) {
        for(String i:sarray){
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    private static void printDoubleArray(double[] darray) {
        for(double i:darray){
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    private static void printIntArray(int[] iarray) {
        for(int i:iarray){
            System.out.print(i + ", ");
        }
        System.out.println();

    }


}
