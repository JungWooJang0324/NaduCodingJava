package chap_09;

import java.util.ArrayList;
import java.util.List;

public class _Quiz_09 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();


        list.add(new Student("유재석", "파이썬"));
        list.add(new Student("박명수", "자바"));
        list.add(new Student("김종국", "자바"));
        list.add(new Student("조세호", "C"));
        list.add(new Student("서장훈", "파이썬"));


        System.out.println("자바 자격증을 보유한 학생");
        System.out.println("-------------------------");
        for(Student student:list){
            if(student.getCertificate().equals("자바")){
                System.out.println(student.getName());
            }
        }




    }

}



class Student {
    public String name;
    public String certificate;

    public Student() {
        this.name = name;
        this.certificate = certificate;
    }

    public Student(String name, String certificate) {
        this.name = name;
        this.certificate = certificate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }
}
