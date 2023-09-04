package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        //Switch Case
        //1등 : 전액 장학금
        //2등 : 반액 장학금
        //3등 : 반액 장학금
        //그 외  : 장학금대상 아님

        int scholarship = 1;
        switch (scholarship) {
            case 1:
                System.out.println("전액 장학금");
                break;
//            case 2 :
//                System.out.println("반액 장학금");
//                break;
//            case 3 :
//                System.out.println("반액 장학금");
//                break;
// ->  case 2와 case 3 통합
            case 2 :
            case 3 :
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
                break;
        }
        System.out.println("조회 완료 #2");

        System.out.println("////////////////////////////////");
        //중고 상품의 등급에 따른 가격을 책정 (1급 : 최상, 4급 : 최하)
        int grade = 1;
        int price = 7000;
        switch (grade){
            case 1 : price += 1000;
            case 2 : price += 1000;
            case 3 : price += 1000; break;
        }
        System.out.println(grade + "등급 제품의 가격 : "+ price + "원");

        System.out.println("////////////////////////////////");





    }
}
