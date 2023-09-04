package chap_06;

public class _04_ReturnParameter {

    public static int getPower(int num){
        int result = num * num;

        return result;
    }

    public static int powerByExp(int number, int exponent){
        int result =1;

        for(int i=0; i< exponent; i++){
            result *= number;
        }

        return result;
    }


    public static void main(String[] args) {

        int retVal = getPower(2);
        System.out.println(retVal);

        retVal = getPower(3);
        System.out.println(retVal);

        retVal = powerByExp(3,3);
        System.out.println(retVal);

    }
}
