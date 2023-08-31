package JAVA_Jungsuk.chapter_14;

import java.util.Comparator;
import java.util.Random;

public class ch14_6 {
    public static void main(String[] args) {
        Random random = new Random();
        random.ints(1,46)
                .distinct()
                .limit(6)
                .sorted()
                .forEach(System.out::println);

    }
}
