package JAVA_Jungsuk.chapter_6;

import lombok.Data;

public class ch6_5 {

    public static void main(String[] args) {
        Student student = new Student("최동훈", 1, 1, 100, 60, 76);
        System.out.println(student.info());

    }

    @Data
    static
    class Student {
        public String name;
        public int ban;
        public int no;
        public int kor;
        public int eng;
        public int math;


        public double getTotal() {
            return kor + eng + math;
        }

        public double getAverage() {
            return (int) (this.getTotal() / 3 * 10 + 0.5) / 10.0;
        }

        public Student(String name, int ban, int no, int kor, int eng, int math) {
            this.name = name;
            this.ban = ban;
            this.no = no;
            this.kor = kor;
            this.eng = eng;
            this.math = math;
        }

        public String info() {
            return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage();
        }

        public Student() {

        }
    }
}

