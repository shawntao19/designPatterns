package pattern.adapter.comment;

/**
 * @Author: xuwentao
 * Created on 2019/10/10 14:02
 */
public class ThinkpadComputer implements Computer {
    public String readSD(SDCard sdCard) {
        if(sdCard == null) {
            throw new NullPointerException("sd card null");
        }
        return sdCard.readSD();
    }
}
