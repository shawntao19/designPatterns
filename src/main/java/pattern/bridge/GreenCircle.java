package pattern.bridge;

/**
 * @Author: xuwentao
 * Created on 2019/10/10 14:16
 */
public class GreenCircle implements DrawAPI {
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
