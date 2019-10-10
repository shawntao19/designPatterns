package pattern.bridge;

/**
 * @Author: xuwentao
 * Created on 2019/10/10 14:17
 */
public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
