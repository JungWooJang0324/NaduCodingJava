package chap_09.Coffee;

public class CoffeeByName {
    public Object name;

    public CoffeeByName(Object name) {
        this.name = name;
    }

    public void ready(){
        System.out.println(name+" 손님 커피 준비 완료");
    }

}
