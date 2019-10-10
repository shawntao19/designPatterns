package pattern.adapter.org;

/**
 * @Author: xuwentao
 * Created on 2019/10/10 12:12
 */
public class Mp4Player implements AdvancedMediaPlayer{

    public void playVlc(String fileName) {
        //什么也不做
    }

    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
