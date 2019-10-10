package pattern.adapter.comment;

/**
 * @Author: xuwentao
 * Created on 2019/10/10 14:04
 */
public class TFCardImpl implements TFCard {
    public String readTF() {
        String msg = "tf card reade msg : hello word tf card";
        return msg;
    }

    public int writeTF(String msg) {
        System.out.println("tf card write a msg : " + msg);
        return 1;
    }
}
