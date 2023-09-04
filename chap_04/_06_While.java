package chap_04;

public class _06_While {
    public static void main(String[] args) {
        //반복문 While
        //수영장에서 수영하는 모습
        int distance = 25;
        int move = 0; //현재 이동거리 0m

        while(move < distance) { //현재 이동거리가 전체 거리보다 작다는 조건이 참인 동안 반복수행
            System.out.println("발차기 계속 합니다.");
            System.out.println("현재 이동거리 : "+ move + "m");
            move+=3;

        }

        System.out.println("도착하였습니다. ");


    }
}
