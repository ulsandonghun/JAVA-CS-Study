package JAVA_Jungsuk.chapter_7;

import lombok.Data;

public class ch7_1 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();
        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();
        for(int i=0; i < deck.cards.length;i++)
            System.out.print(deck.cards[i]+",");
        System.out.println();
        System.out.println(deck.pick(0));

    }





}

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];
    SutdaDeck() {
        for (int i = 0; i < cards.length; i++) {
            int num=i%10+1;
            boolean check=(i==1-1||i==3-1||i==8-1);

            cards[i]=new SutdaCard(num,check);

        }

    }

    public void shuffle(){
        for (int i = 0; i < cards.length; i++) {
            int j=(int)(Math.random()* cards.length);

             SutdaCard sutdaCard=cards[i];
            cards[i]=cards[j];
            cards[j]=sutdaCard;

        }
    }
    public SutdaCard pick(int index){
        return cards[index];

    }

    public SutdaCard pick(){
        return cards[(int)(Math.random()* cards.length)];
    }
}

@Data
class SutdaCard {
    int num;
    boolean isKwang;
    SutdaCard() {
        this(1, true);
    }
    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }
    // info() Object toString() . 대신 클래스의 을 오버라이딩했다
    public String toString() {
        return num + ( isKwang ? "K":"");
    }
}
/*
7-3
오버라이딩의 정의 : 조상 클래스의 메서드를 자손클래스에서 재정의 하는것이다.
7-4
c,d
7-5
자식의 생성자 호출 후 -> 컴파일러가 자동으로 조상클래스의 기본생성자를 super()로 호출함.
7-6
생성자의 정의는 "인스턴스 변수를 초기화하는 함수" 인데, 조상클래스의 인스턴스 변수를 초기화 하기 위햇 ㅓ이다.
7-7

child()
parent()

7-9
제어자 final은 변경될 수 없는 이라는 의미를 가지고 있다.

 */
