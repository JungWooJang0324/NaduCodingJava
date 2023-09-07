package chap_09.Coffee;

public class CoffeeByNickname {
    public String nickname;

    public CoffeeByNickname(String nickname) {
        this.nickname = nickname;
    }

    public void ready(){
        System.out.println(nickname+"번 손님 커피 준비 완료");
    }
}
