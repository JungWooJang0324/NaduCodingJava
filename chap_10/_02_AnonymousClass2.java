package chap_10;

public class _02_AnonymousClass2 {
    public static void main(String[] args) {
        //익명클래스 
        HomeMadeBurger momMadeBurger = getHomeMadeBurger();
        momMadeBurger.cook();
        System.out.println("-----------------------------------------");

        HomeMadeBurger broMadeBurger = getBroMadeBurger();
        broMadeBurger.cook();
        System.out.println("-----------------------------------------");

    }

    private static HomeMadeBurger getBroMadeBurger() {
        return new HomeMadeBurger() {

            @Override
            public void cook() {
                System.out.println("집에서 동생이 만들어준 군대리아 버거");
                System.out.println("재료 : 빵, 치킨패티, 양배추 샐러드, 딸기잼, 치즈, 삶은 계란");
            }
        };
    }

    public static HomeMadeBurger getHomeMadeBurger() {
        return new HomeMadeBurger() {
            @Override
            public void cook() {
                System.out.println("엄마가 만들어준 홈메이드 버거");
                System.out.println("재료 : 빵, 소고기패티, 양상추, 해시브라운, 마요, 피클");
            }
        };
    }

}

//수제버거
abstract class HomeMadeBurger {
    public abstract void cook();
}
