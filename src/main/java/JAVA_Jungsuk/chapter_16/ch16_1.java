package JAVA_Jungsuk.chapter_16;

public class ch16_1 {
    public static void main(String[] args) {

        byte[] ip = {(byte)192,(byte)168,(byte)10,(byte)100};
        byte[] subnet = {(byte)255,(byte)255,(byte)255,(byte)0};
        byte[] nwAddress = new byte[4]; // 네트워크 주소
        byte[] hostAddress = new byte[4]; // 호스트 주소
        System.out.print(" 네트워크 주소 :");
        for(int i=0; i < ip.length;i++) {
            nwAddress[i] = (byte)(ip[i] & subnet[i]); // & . 연산을 수행한다
            System.out.print(nwAddress[i] >=0 ?
                    nwAddress[i] : nwAddress[i]+256);
            System.out.print(".");
        }
        System.out.println();
        System.out.print(" 호스트 주소 :");
        for(int i=0; i < ip.length;i++) {
            hostAddress[i] = (byte)(ip[i] & ~subnet[i]); // & . 연산을 수행한다
            System.out.print(hostAddress[i] >=0 ?
                    hostAddress[i] : hostAddress[i]+256);
            System.out.print(".");
        }
        System.out.println();
    }
}
/*
16-2
TCP 는 connection-oriented (1:1 핸드쉐이킹 과정을 필요로 함.)
UDP 는 connectionless 통신방식임.

 */
