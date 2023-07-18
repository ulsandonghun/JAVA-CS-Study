package JAVA_Jungsuk.chapter_7;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

public class ch7_10 {

    public static void main(String[] args) {
        MyTv2 t = new MyTv2();

        t.setChannel(10);
        System.out.println("CH:"+t.getChannel());
        t.setVolume(20);
        System.out.println("VOL:"+t.getVolume());
    }


}

class MyTv2 {
    private boolean isPowerOn;
    private int channel;
    private int volume;
    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;
    public void setVolume(int volume){
        if(volume > MAX_VOLUME || volume < MIN_VOLUME)
            return;
        this.volume = volume;
    }
    public int getVolume(){
        return volume;
    }
    public void setChannel(int channel){
        if(channel > MAX_CHANNEL || channel < MIN_CHANNEL)
            return;
        this.channel = channel;
    }
    public int getChannel(){
        return channel;
    }




/*
(1) . 알맞은 코드를 넣어 완성하시오
*/
}

