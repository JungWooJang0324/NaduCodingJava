package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name;
        name = "장정우";

        int hour = 15;

        System.out.println(name + "님, 배송이 시작됩니다. " + hour + "시에 방문 예정입니다. ");

        System.out.printf("%s님, 배송이 완료되었습니다. ", name);

        System.out.println();
        name = "바로코딩";
        hour = 13;
        System.out.println(name + "님, 배송이 시작됩니다. " + hour + "시에 방문 예정입니다. ");
        System.out.printf("%s님, 배송이 완료되었습니다. ", name);

        System.out.println();
        double score = 90.5;
        char grade = 'A';
        name = "강백호";
        System.out.println(name + "님의 평균 점수는 "+ score + "점 입니다. ");
        System.out.println(name + "님의 학점은 "+ grade + "입니다. ");

        boolean flag = true;
        System.out.println("이번 시험에 합격 했을까요? "+ flag);
        flag = false;
        System.out.println("이번 시험에 합격 했을까요? "+ flag);


        double d = 3.14;
        float f = 3.14f;

        System.out.println(d);
        System.out.println(f);




    }

}
