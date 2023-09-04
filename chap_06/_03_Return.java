package chap_06;

public class _03_Return {
    //리턴값, Return

    // 호텔 번호
    public static String getPhNumber(){
        String phNum = "02-1234-1234";

        return phNum;
    }


    //호텔주소
    public static String getAddr(){
        String addr = "서울 어딘가";

        return addr;
    }

    //호텔 액티비티
    public static String getActivity(){

        return "볼링장, 탁구장";
    }

    public static void main(String[] args) {

        String connectNum = getPhNumber();
        System.out.println("호텔 전화번호 :"+ connectNum);
        System.out.println("호텔 주소 :  " + getAddr());
        System.out.println("호텔 주소 :  "+ getActivity());

    }

}
