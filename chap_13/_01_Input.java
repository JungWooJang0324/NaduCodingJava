package chap_13;

import java.util.Scanner;

public class _01_Input {
    public static void main(String[] args) {
        //사용자 입력 받기
        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력하세요");
        String name = sc.next();

        System.out.println("이름은 "+name + "입니다.");

        System.out.println( "무슨 언어를 배웠나요 ? ");
//        String lang = sc.next(); //한단어 자바만 가능 띄어쓰기로 구분한다
        String lang = sc.nextLine(); //한줄 처리
        System.out.println("언어 : " + lang);


        System.out.println("기분은 어떤가요? : ");
        String feel = sc.nextLine();
        System.out.println(feel);


    }
}
