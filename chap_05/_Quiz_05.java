package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        int[] shoeSize = new int[10];
        int size=250, i=0;

        while(size<296){
            shoeSize[i] = size;
            size += 5;
            i++;
        }

        for(int ss:shoeSize){
            System.out.println("사이즈 " +ss + " (재고 있음)");
        }



    }
}
