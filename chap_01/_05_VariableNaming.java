package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        // 변수 이름 :
        // 저장할 값에 어울리는 이름
        // 밑줄, 문자, 숫자 사용가능 (공백 x)
        // 밑줄 또는 문자로 시작 가능
        // 한 단어 또는 2개 이상 단어의 연속
        // 예약어 사용불가능

        //입국신고서
        String nationality = "대한민국 ";
        String firstName = "Julie";
        String last_name = "Jang";
        String date_of_birth = "1997-03-24"; //생년월일
        String residentialAddr = "신라호텔"; //체류지
        String purposeOfVisit = "여행";
        String flightNo = "KE1090"; //항공 편명

        String _flightNo = "KE6567"; //밑줄 가능

//        String -flightNo = "KE6567";  //불가능

        int accompany = 2; //가족 동반
        int lengthOfStay = 5; //체류기간

        String item1 = "시계";
        String item2 = "가방";
//        String 3item2 = "전자제푸ㅁ"; 숫자 먼저 불가능

        //이름이 크게 중요하지 않을 때
        int i=0;
        String s = "";
        String str = "";

        //절대 변하지 않는 상수는 대문자
        final String CODE = "KR";
       // CODE = "";



    }

}
