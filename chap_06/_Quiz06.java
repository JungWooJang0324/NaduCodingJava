package chap_06;

public class _Quiz06 {

    public static String personalInfo(String data, int hid){
        String result = data.substring(0, hid);
        for(int i=hid; i<data.length(); i++){
               result += "*";
        }

        return result;
    }

    public static void main(String[] args) {

        String name = "장정우";
        String idNum = "970324-1111111";
        String tel = "010-8888-8888";

        System.out.println(personalInfo(name, 1));
        System.out.println(personalInfo(tel, 3));


    }


}
