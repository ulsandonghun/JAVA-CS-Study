package JAVA_Jungsuk.chapter_14;

import java.util.Arrays;
import java.util.stream.Stream;

public class ch14_1 {
    public static void main(String[] args) {
        String[] strArr = {"aaa", "bb", "c", "dddd"};

        Stream<String> stream= Arrays.stream(strArr);
        int sum = stream.mapToInt((String s) -> s.length()).sum();
        System.out.println(sum);
    }

}
/*
14-1.
(a)
(String name, int i) ->{
sout(name+"="+i);
}
(b)
(int x) -> x*x

(c)
() -> (int)(Math.random() * 6);

(d)
(int[] arr) -> {
int sum = 0;
for(int i : arr)
sum += i;
return sum;
}
(e)
() -> new int[]{}
14-2
String::length();
int[]::new
Array::stream
String::equals
Integer::compare
*/
