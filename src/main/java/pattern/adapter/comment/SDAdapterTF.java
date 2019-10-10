package pattern.adapter.comment;

/**
 * @Author: xuwentao
 * Created on 2019/10/10 14:04
 */
public class SDAdapterTF implements SDCard {
    private TFCard tfCard;
    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }
    public String readSD() {
        System.out.println("adapter read tf card ");
        return tfCard.readTF();
    }
    public int writeSD(String msg) {
        System.out.println("adapter write tf card");
        return tfCard.writeTF(msg);
    }
}
