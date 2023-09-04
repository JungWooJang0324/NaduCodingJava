package chap_07;

public class _03_ClassVariable {

    public static void main(String[] args) {
        Blackbox b1 = new Blackbox();
        b1.setModelName("까망이");
        System.out.println(b1.getModelName());

        Blackbox b2 = new Blackbox();
        b2.setModelName("하양이");
        System.out.println(b2.getModelName());


        //자동 신고기능 개발 여부
        System.out.println(" - 개발 전 - ");
        System.out.println(b1.getModelName() + " - 자동 신고기능 :  "+b1.canAutoReport);
        System.out.println(b2.getModelName() + " - 자동 신고기능 :  "+b2.canAutoReport);

        System.out.println("모든 블랙박스 제품 자동 신고 기능 : "+Blackbox.canAutoReport);

        System.out.println(" - 개발 전 - ");
        Blackbox.canAutoReport = true;

        System.out.println(b1.getModelName() + " - 자동 신고기능 :  "+b1.canAutoReport);
        System.out.println(b2.getModelName() + " - 자동 신고기능 :  "+b2.canAutoReport);

        System.out.println("모든 블랙박스 제품 자동 신고 기능 : "+Blackbox.canAutoReport);




    }

}
