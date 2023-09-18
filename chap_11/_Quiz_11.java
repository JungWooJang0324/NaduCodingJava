package chap_11;

public class _Quiz_11 {
    public static void main(String[] args) {
        int num = 1;

        try {
            if(num == 0){
                System.out.println("상품 구매를 완료 하였습니다.");
            } else if (num==1) {
                throw new NotTheRightTimeException("상품 구매 가능 시간이 아닙니다.");
            } else if (num == 2) {
                throw new SoldOutException("해당 상품은 매진입니다. ");
            }

        } catch (NotTheRightTimeException e) {
            System.out.println(e.getMessage());
            System.out.println("상품 구매는 20시부터 가능합니다.");

        } catch (SoldOutException e) {

            System.out.println("다음기회에 이용해 주세요.");
        }

    }
}

class NotTheRightTimeException extends Exception{
    public NotTheRightTimeException(String s) {
        super(s);
    }
}

class SoldOutException extends Exception{
    public SoldOutException(String s) {
        System.out.println("해당 상품은 매진 되었습니다");
    }
}