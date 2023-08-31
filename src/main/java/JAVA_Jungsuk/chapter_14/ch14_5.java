package JAVA_Jungsuk.chapter_14;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class ch14_5 {
    public static void main(String[] args) {
        String[] strArr = { "aaa","bb","c", "dddd" };
        Stream<String> stream= Arrays.stream(strArr);

        stream.map(String::length).sorted(Comparator.reverseOrder())
                .limit(1).forEach(System.out::println);

    }
}
