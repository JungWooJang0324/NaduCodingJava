package chap_13;

import java.io.*;
import java.util.Scanner;

public class _Quiz_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("속담 퀴즈입니다. 빈 칸에 알맞은 말을 입력하세요 (주관식)");
        System.out.println("------------------------------------------------");


        File file = new File(".\\src\\chap_13\\saying.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(".\\src\\chap_13\\saying.txt"));
            String quiz = "" , answer = "", input="", result="";

            while(true){
                quiz = br.readLine();
                answer = br.readLine();
                if(quiz==null || answer ==null) break;

                System.out.println(quiz);
                System.out.print (" 정답 입력 : ");
                input = sc.nextLine();

                result = input.equals(answer) ? "정답입니다!! ":"틀렸습니다. 정답은 "+answer+"입니다. ";
                System.out.println(result);
                System.out.println();
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
