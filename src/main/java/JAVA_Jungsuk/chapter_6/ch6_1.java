package JAVA_Jungsuk.chapter_6;

public class ch6_1 {

    public static void main(String[] args) {
        SutdaCard sutdaCard = new SutdaCard(3, false);
        SutdaCard sutdaCard2 = new SutdaCard();

        System.out.println(sutdaCard.info());
        System.out.println(sutdaCard2.info());

    }
}
class SutdaCard{
    private int num;
    private boolean isKwang;

    public SutdaCard(int num, boolean isKwang) {
        this.num=num;
        this.isKwang=isKwang;
    }

    public SutdaCard() {
        this(1,true);
    }

    public String info(){
        return num+(isKwang?"k":"");
    }
}