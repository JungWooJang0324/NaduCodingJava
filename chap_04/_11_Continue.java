package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        //Continue

        int max = 20;
        int sold =0;
        int noShow = 17;

        for (int i = 0; i <= 50; i++) {

            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다. ");

            //손님이 없다면
            if (i== noShow){
                System.out.println(i + "번 손님, 노쇼로 인해 다음손님에게로 넘어갑니당");
                continue;
            }

            sold++;
            if(sold == max){
                System.out.println("금일 재료 모두 소진되었습니다. ");
                break;
            }
        }

        System.out.println("/////////////////////////////////////////////////////////");

        sold = 0;
        int index = 0;
        while (index <= 50){
            //먼저 처리가능
            index++;
            System.out.println(index + "손님 주문하신 치킨 나왔습니다. ");

            if (index == noShow){
                System.out.println(index + "번 손님, 노쇼로 인해 다음 손님에게로 넘어갑니당");

                //while 문에서는 뒤에를 타지않고 바로 처음으로 넘어가기때문에 index++을 해줘야함
                //index++;
                continue;
            }

            sold++;
            if(sold == max){
                System.out.println("금일 재료가 모두 소진 되었습니다.");
                break;
            }
//            index++;
        }
        System.out.println("영업을 종료합니다.");

    }
}
