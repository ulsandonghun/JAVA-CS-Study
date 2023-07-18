package JAVA_Jungsuk.chapter_6;

public class ch6_3 {
    public static void main(String[] args) {
        ch6_5.Student s = new ch6_5.Student();
        s.name = "홍길동";
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;
        System.out.println("이름 :"+s.name);
        System.out.println("총점 :"+s.getTotal());
        System.out.println("평균 :"+s.getAverage());

    }

}


