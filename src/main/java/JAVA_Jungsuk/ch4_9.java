package JAVA_Jungsuk;

public class ch4_9 {
    public static void main(String[] args) {
        String str = "12345";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            Integer integer = Integer.valueOf(String.valueOf(c));
            System.out.println("integer = " + integer);
            sum+=c-'0';
        }
        System.out.println("sum=" + sum);
    }

}
