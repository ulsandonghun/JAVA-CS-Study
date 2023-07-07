package JAVA_Jungsuk;

public class ch4_10 {
    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;

        int multiplier=10;

        while(num!=0){
            sum+=num%multiplier;
            num/=multiplier;

        }

        System.out.println("sum="+sum);
    }

}
