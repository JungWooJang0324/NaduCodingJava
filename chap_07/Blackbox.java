package chap_07;

public class Blackbox {

    private String modelName;
    private String resolution;
    private int price;
    private String color;

    static boolean canAutoReport = false; //자동 신고 가능
    void autoReport(){
        if(canAutoReport){
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        }

        else {
            System.out.println("자동신고 기능이 활성화 되지 않앗습니다..");
        }

    }

    void insertMemoryCard(int capacity){
        System.out.println("메모리 카드가 삽입 되었습니다.");
        System.out.println("용량은 " + capacity + "GB입니다. ");

    }

    int getVideoFileCount(int type){
        if(type == 1){ //일반 영상
            return 9;
        }else if (type == 2){///이벤트영상
            return 1;
        }

        return 10;
    }


    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Blackbox{" +
                "modelName='" + modelName + '\'' +
                ", resolution='" + resolution + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
