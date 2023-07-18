package JAVA_Jungsuk.chapter_6;

public class ch6_7 {

    public static void main(String[] args) {
        MyPoint p = new MyPoint(1,1);
// p (2,2) . 와 의 거리를 구한다
        System.out.println(p.getDistance(2,2));

    }
}
class MyPoint{
    int x;
    int y;

    public MyPoint(int x, int y) {

        this.x = x;
        this.y = y;
    }

    double getDistance(int x1,int y1){

        return Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
    }
}

// 클래스 변수 : width,height
// 인스턴스 변수 : kind, num
// 지역변수 : k, n
/*
6-10
b.(인스턴스 변수 초기화),e.
6-11
c.
6-12
c,d.
6-13
b,c,d
오버로딩 조건, 함수이름이 같고 매개변수의 개수 또는 타입이 달라야 한다.
6-14
c,e
초기화 블록 ? {} 으로 된것.
6-15
a.
6-16
a. e.
힙 영역에는 인스턴스 변수가 생성되고 지역변수는 호출스택에 젖아됨.
6.17
b.
6.18
중요 포인트 : 클래스 변수(static) 는 non-static context에서 사용 가능하지만,
인스턴스변수(non-static)는 static context에서 사용 불가능하다. 이유는 컴파일 시점에
static 변수에 대한 정보가 이미 올라와 있지만, instatnce 변수는 초기화 하지 않으면
올라와 있지 않기 때문이다.

멀티스레드에서 동시성 이슈가 생길수 있다.
스프링은 싱글톤으로 동작하기 때문이다.

 */