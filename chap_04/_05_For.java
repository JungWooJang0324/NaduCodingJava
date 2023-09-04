package chap_04;

public class _05_For {
    public static void main(String[] args) {
        //반복문 For
        //나코 매장
        System.out.println("어서오세요 나코입니다.");
//        또 다른 손님등장
        System.out.println("어서오세요 나코입니다.");


        //반복문 사용 for

        //만약 인사법이 바뀐다면
        for(int i=0; i<5;i++){
            System.out.println("어서오세요. 코나 입니다. " + i);
        }

        System.out.println("////////////////////짝수/////////////////////");

        //짝수만 출력
        for(int i=0; i<10; i+=2){
            System.out.println(i);
        }

        System.out.println("////////////////////홀수////////////////////");
        for(int i=1; i<10; i+=2){
            System.out.println(i);
        }
        System.out.println("////////////////////거꾸로 숫자////////////////////");
        for(int i=5; i>0; i--){
            System.out.println(i);
        }

        System.out.println("////////////////////1부터 10까지 수들의 합////////////////////");
        int total = 0;
        for(int i=0; i<=10; i++) total += i;
        System.out.println(total);



    }
}
