package JAVA_Jungsuk.chapter_9;

public class ch9_7 {

    public static void main(String[] args) {
        Card card=new Card(2);
        Card card1=new Card();
        Card card2=card;
        System.out.println("card = " + card);
        System.out.println("card1 = " + card1);
        System.out.println("card2 = " + card2);
    }
}

class Card{
    static int num;
    public Card(int num){
        this.num=num;
    }
    public Card(){

    }

}
