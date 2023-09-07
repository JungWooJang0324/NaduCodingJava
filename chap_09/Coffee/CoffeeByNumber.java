package chap_09.Coffee;

public class CoffeeByNumber {
    public int waitingNum;

    public CoffeeByNumber(int waitingNum) {
        this.waitingNum = waitingNum;
    }

    public void ready(){
        System.out.println(waitingNum+" 손님 커피 준비 완료");
    }

}
