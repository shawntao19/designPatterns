package pattern.adapter.comment;

/**
 * @Author: xuwentao
 * Created on 2019/10/10 14:02
 */
public class SDCardImpl implements SDCard {
    public String readSD() {
        String msg = "sdcard read a msg :hello word SD";
        return msg;
    }
    public int writeSD(String msg) {
        System.out.println("sd card write msg : " + msg);
        return 1;
    }
}
