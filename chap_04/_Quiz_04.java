package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        //조건문 활용하여 주차요금 정산 프로그램

        //주차요금 시간당 4000원(일일 최대 요금 3만원)
        // 경차 또는 장애인 차량 최종요금 에서 50%

        String carType="경차";
        int time = 5;

        int result = new _Quiz_04().parkingFee(carType, time);
        System.out.println("주차 요금은 "+result+"원 입니다. ");


    }



    public int parkingFee(String carType, int time){
        int result= time * 4000;

        if(result > 30000) result = 30000;

        if(carType.equals("경차") || carType.equals("장애인 차량")){
            result *= 0.5;
        }



        return result;
    }

}
