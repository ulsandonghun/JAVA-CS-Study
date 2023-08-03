package JAVA_Jungsuk.chapter_8;

import java.util.Scanner;

public class ch8_8 {
    public static void main(String[] args)
    {
// 1~100 answer . 사이의 임의의 값을 얻어서 에 저장한다
        int answer = (int)(Math.random() * 100) + 1;
        int input = 0; // 사용자입력을 저장할 공간
        int count = 0; // 시도횟수를 세기 위한 변수
        do {
            count++;
            System.out.print("1 과 100사이숫자 입력 :");
            try {
                input = new Scanner(System.in).nextInt();
                if(answer > input) {
                    System.out.println(" 더 큰수 입력해.");
                } else if(answer < input) {
                    System.out.println(" 더 작은수 입력.");
                } else {
                    System.out.println(" 맞췄어.");
                    System.out.println(" 시도횟수는"+count+" 번이야.");
                    break; // do-while문을 벗어난다
                }
            }catch (Exception e ){
                System.out.println("유효하지 않은 값입니다. 다시 값을 입력하세요");
            }

        } while(true); // 무한반복문
    } // end of main

}
