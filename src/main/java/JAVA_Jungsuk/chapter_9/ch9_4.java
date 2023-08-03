package JAVA_Jungsuk.chapter_9;

public class ch9_4 {

    static void printGraph(int[] dataArr, char ch) {
/*
(1) printGraph . 메서드를 작성하시오
*/

        for (int i = 0; i < dataArr.length; i++) {
            int cnt = dataArr[i];
            for (int j = 0; j < cnt; j++) {
                System.out.print("*");
            }
            System.out.println(cnt);
        }
    }
    public static void main(String[] args) {
        printGraph(new int[]{3,7,1,4},'*');
    }
}
