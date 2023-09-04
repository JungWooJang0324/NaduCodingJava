package chap_04;

public class _09_MultipleTable {
    public static void main(String[] args) {
        //구구단

        //2 * 1 = 2
        //2 * 2 = 4
        //2 * 3 = 6

        for(int i=2; i<10; i++){
            System.out.println(i+ "단 : ");
            for(int j=1; j<10; j++){
                System.out.printf("%d * %d = %d", i, j, i*j);
                System.out.println();
            }
            System.out.println();

        }



    }
}
