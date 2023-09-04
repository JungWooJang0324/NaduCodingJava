package chap_01;

public class _07_TypeCasting {

    public static void main(String[] args) {
      //TypeCasting : 형변환

        int score = 93;
        System.out.println(score);
        System.out.println((float)score);
        System.out.println((double) score);

        //float, double to int
        float score_f = 93.3f;
        double score_d = 98.8;

        System.out.println((int)score_f);
        System.out.println((int)score_d);


        score = score + (int)score_d;
        System.out.println(score);

        score_d = 93 + 98.8;
        int convertedScoreInt = (int)score_d; //191.8 ->191


        //문자열처리 :
        String s1 = String.valueOf(93);
        s1 = Integer.toString(98);
        System.out.println(s1);


        String s2 = String.valueOf(98.8);
        System.out.println(s2);
        s2 = Double.toString(97.8);
        System.out.println(s2);

        //문자 -> 숫자
        int i = Integer.parseInt("93");
        System.out.println(i);

        double d = Double.parseDouble("98.8");
        System.out.println(d);


    }
}
