package JAVA_Jungsuk.chapter_9;

public class ch9_1 {
    public static void main(String[] args) {
        SutdaCard c1 = new SutdaCard(3,true);
        SutdaCard c2 = new SutdaCard(3,true);
        System.out.println("c1="+c1);
        System.out.println("c2="+c2);
        System.out.println("c1.equals(c2):"+c1.equals(c2));
    }


}

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
    @Override
    public boolean equals(Object obj) {
/*
(1) num, isKwang 매개변수로 넘겨진 객체의 과
멤버변수 을 비교하도록 오버라이딩 하시오 num, isKwang .
*/
       SutdaCard card=(SutdaCard) obj;

        if(card.num==this.num&& card.isKwang==this.isKwang){
            return true;
        }else{
            return false;
        }

    }
    public String toString() {
        return num + ( isKwang ? "K":"");
    }
}

