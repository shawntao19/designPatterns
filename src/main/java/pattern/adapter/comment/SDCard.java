package pattern.adapter.comment;

/**
 * @Author: xuwentao
 * Created on 2019/10/10 14:01
 */
public interface SDCard {
    //读取SD卡方法
    String readSD();
    //写入SD卡功能
    int writeSD(String msg);
}
