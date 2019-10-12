package pattern.strategy.comment;

/**
 * @Author: xuwentao
 * Created on 2019/10/12 14:25
 */
public class FlyWithRocket implements FlyBehavior {

    public void fly() {
        System.out.println("带上火箭筒，飞~~~");
    }
}
