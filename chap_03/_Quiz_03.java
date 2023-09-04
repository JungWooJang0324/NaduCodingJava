package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String id = "901231-1234567";
        System.out.println(id.substring(0, 8));

        String id2 = "030708-4234567";
        System.out.println(id2.substring(0, id2.indexOf("-")+2));

    }
}
