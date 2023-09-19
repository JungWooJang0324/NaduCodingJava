package chap_12;

public class _Quiz_12 {
    public static void main(String[] args) {

        Runnable setA = new Runnable() {
            @Override
            public void run() {
                for(int i=1; i<6; i++){
                    System.out.println("A 상품 준비 " + i +" /5");
                }
                System.out.println("A 상품 준비 완료");
            }
        };
        Runnable setB = () -> {
            for(int i=1; i<6; i++){
                  System.out.println("B 상품 준비 " + i +" /5");
            }
            System.out.println("B 상품 준비 완료");
        };


        Thread present1 = new Thread(setA);
        Thread present2 = new Thread(setB);

        present1.start();
        present2.start();

        try {
            present1.join();
            present2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}

