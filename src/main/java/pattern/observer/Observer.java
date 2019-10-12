package pattern.observer;

/**
 * @Author: xuwentao
 * Created on 2019/10/12 11:13
 */
public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
