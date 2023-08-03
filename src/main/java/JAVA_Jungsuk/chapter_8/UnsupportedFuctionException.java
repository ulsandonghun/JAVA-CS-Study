package JAVA_Jungsuk.chapter_8;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UnsupportedFuctionException extends RuntimeException{

    final private int ERR_CODE;


    public UnsupportedFuctionException() {
        ERR_CODE = 100;
    }

    public UnsupportedFuctionException(String s, int i) {
        super(s);
        ERR_CODE=i;
    }

    public int getERR_CODE() {
        return ERR_CODE;
    }

    @Override
    public String getMessage() {
        return "["+getERR_CODE()+"]"+super.getMessage();
    }
}
/*
8-10
2 4 7
 */
