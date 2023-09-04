package chap_07;

public class _02_InstanceVariabl3e {

    public static void main(String[] args) {
        Blackbox bb1 = new Blackbox();
        bb1.setModelName("까망이");
        bb1.setColor("black");
        bb1.setPrice(200000);
        bb1.setResolution("UHD");


        System.out.println(bb1.toString());
    }

}
