package chap_07;

public class _18_Enum {
    public static void main(String[] args) {
        // 열거형*(Enum)
        // 달력 : Jan, Feb, mar ...
        // 옷 : S, M, L, XL
        // OS 종류:

        Resolution rs = Resolution.HD;
        System.out.println(rs);

        rs = Resolution.FHD;
        System.out.println(rs);

        switch (rs) {
            case HD :
                System.out.println("일반화질");
                break;
            case FHD:
                System.out.println("고화질");
                break;
            case UHD:
                System.out.println("초고화질");
                break;
        }

        rs = Resolution.valueOf("UHD");
        System.out.println(rs);


        //반복문으로 뽑아보기
        for(Resolution rs1 : Resolution.values()){
            System.out.println(rs1.name() + ": "+ rs1.ordinal());
//
//            HD: 0
//            FHD: 1
//            QHD: 2
//            UHD: 3
        }


        System.out.println("--------------------");

        for(Resolution rs1 : Resolution.values()) {
            System.out.println(rs1.name()+ " : " + rs1.getWidth() + "사이즈 입니다.");
        }

    }

}


enum Resolution {
    HD(1280), FHD(1920), QHD(3840), UHD(1280);
    
    //값을 저장할 변수
    private final int width;
    Resolution(int width) {
        this.width = width;
    }

    public int getWidth(){
        return width;
    }

}
